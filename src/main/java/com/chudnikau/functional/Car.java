package com.chudnikau.functional;

public class Car implements Vehicle {

    @Override
    public Integer wheels(VehicleConsumer vehicleConsumer) {
        return vehicleConsumer.wheels(1);
    }
}
