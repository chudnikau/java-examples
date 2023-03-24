package com.chudnikau.interfaces;

public class Main {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.stop();
        System.out.println(cdPlayer.powerCount());
    }
}
