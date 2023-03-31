package com.chudnikau.inherited.vehicle;

public class Bus extends Vehicle {
    @Override
    String get() {
        return "Bus";
    }
    @Override
    public Integer number() {
        return 200;
    }
}
