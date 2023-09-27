package com.chudnikau.packages;

import com.chudnikau.packages.package1.Bus;
import com.chudnikau.packages.package2.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle(new Bus());
        bus.startEngine();
    }
}
