package com.chudnikau.functional;

public class Bus implements Vehicle {

    @Override
    public Integer wheels(VehicleConsumer vehicleConsumer) {
        return vehicleConsumer.wheels(0);
    }

}
