package com.chudnikau.exception;

public class Player {

    private Boolean hasNextSong() {
        return null;
    }

    void next() throws NavigationSongException {
        if (hasNextSong() == null) {
            throw new NavigationSongException("Can't play next song");
        }
    }

    void stop() {
        System.out.println("stop");
    }

    void play() throws PlaySongException {
        throw new PlaySongException("Can't play song");
    }

    void close() {
        throw new RuntimeException("Can't close the player");
    }

}
