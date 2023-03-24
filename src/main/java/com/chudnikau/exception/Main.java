package com.chudnikau.exception;

/*
 Перехватить исключение можно следующими способами:
   1) catch (NavigationSongException | PlaySongException e)
   2) определить для каждого исключения свой catch блок
     } catch (NavigationSongException e) {
     } catch (PlaySongException e) {
     }

  Следует помнить:

  Если определить класс Exception в самом начале блока:
    catch (Exception | NavigationSongException | PlaySongException e)
  , то компилятор будет ругаться на multi-catch

  Тоже самое, если определить Exception в начале всех блоков:
    } catch (Exception e) {
    } catch (NavigationSongException e) {  <<< multi-catch exception
    } catch (PlaySongException e) {        <<< multi-catch exception
    }

  Но есть исключение:
    Если определить Exception в конце блока:
      catch (NavigationSongException | PlaySongException e | Exception e)  <<< компилятор не пропустит
    и соответственно
      } catch (NavigationSongException e) {
      } catch (PlaySongException e) {
      } catch (Exception e) {       <<< компилятор пропустит, но покажет warning об identical

  RuntimeException может быть проигнорирована в программном коде, когда обработка остальных Exception
  обеспечивается компилятором и является обязательной.
*/

public class Main {

    public static Player player = new Player();

    public static void main(String[] args) {
        try {
            playFirstSong();
            playNextSong();
        } finally {
            // RuntimeException is not caught up the main class
            closePlayer();
        }
    }

    public static void playFirstSong() {
        try {
            player.stop();
            player.play();
        } catch (PlaySongException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void playNextSong() {
        try {
            player.next();
            player.stop();
            player.play();
        } catch (NavigationSongException | PlaySongException e) {
            e.printStackTrace();
        }
    }

    public static void closePlayer() {
        player.close();
    }
}
