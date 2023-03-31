package com.chudnikau.inherited.constructor;

public class ClassB extends ClassA {

    private final int number = 100;

    ClassB() {
        print();
    }

    public void print() {
        System.out.println(number);
    }

}
