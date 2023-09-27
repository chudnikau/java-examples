package com.chudnikau.inherited;

public class Car extends Vehicle {
    @Override
    String get() {
        return "Car";
    }
    @Override
    public Integer number() {
        return 100;
    }
}
