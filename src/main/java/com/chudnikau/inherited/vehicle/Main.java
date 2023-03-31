package com.chudnikau.inherited.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        BaseVehicle bus = new Bus();
        Bus hugeBus = new HugeBus();

        System.out.println(car.get());          // Car
        System.out.println(bus.number());       // 200
        System.out.println(hugeBus.number());   // 200
    }
}
