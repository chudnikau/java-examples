package com.chudnikau.packages.package2;

import com.chudnikau.packages.package1.Bus;

public class Vehicle {

    private Bus bus;

    public Vehicle(Bus bus) {
        this.bus = bus;
    }

    public void startEngine() {
        bus.startEngine();
    }
}
