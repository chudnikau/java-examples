package com.chudnikau.overloading;

public class Tree {

    public int height() {
        return 100;
    }

    public String height(Integer value) {
        return "height(Integer)";
    }

    public String height(short value) {
        return "height(short)";
    }

    public String height(int value) {
        return "height(int)";
    }

    public String height(long value) {
        return "height(long)";
    }
 }
