package com.chudnikau.constructor;

public class Main {
    public static void main(String[] args) {
//        new ClassB();
        new ClassC(1);

        Runtime.getRuntime().gc();
    }
}
