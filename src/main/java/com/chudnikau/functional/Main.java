package com.chudnikau.functional;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        VehicleConsumer vehicleCarConsumer = (v) -> 4 + v;
        VehicleConsumer vehicleBusConsumer = (v) -> 8 + v;

        System.out.println(car.wheels(vehicleCarConsumer));
        System.out.println(bus.wheels(vehicleBusConsumer));
    }

}
