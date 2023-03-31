package com.chudnikau.inherited.constructor;

public class ClassA {

    private final int number = 200;

    ClassA() {
        print();
    }

    public void print() {
        System.out.println(number);
    }

}
