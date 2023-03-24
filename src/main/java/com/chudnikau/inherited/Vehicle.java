package com.chudnikau.inherited;

public abstract class Vehicle implements BaseVehicle {

    abstract String get();

    @Override
    public Integer number() {
        return 0;
    }

}
