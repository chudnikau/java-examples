package com.chudnikau.interfaces;

public class CDPlayer extends Power implements Player {

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public Integer powerCount() {
        return 4;
    }
}
