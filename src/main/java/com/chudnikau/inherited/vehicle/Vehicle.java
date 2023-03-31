package com.chudnikau.inherited.vehicle;

public abstract class Vehicle implements BaseVehicle {

    abstract String get();

    @Override
    public Integer number() {
        return 0;
    }

}
