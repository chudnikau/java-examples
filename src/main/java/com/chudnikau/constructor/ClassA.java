package com.chudnikau.constructor;

public class ClassA {

    ClassA() {
        print();
    }

    public void print() {
        // this method is not called
        int number = 200;
        System.out.println(number);
    }

}
