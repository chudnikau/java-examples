package com.chudnikau.constructor;

public class ClassC extends ClassD {

    public ClassC(Integer size) {
        System.out.println("Constructor with parameter");
    }

    public ClassC() {
        System.out.println("This constructor is created by default");
    }
}
