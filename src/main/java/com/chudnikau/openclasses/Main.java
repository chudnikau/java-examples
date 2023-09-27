package com.chudnikau.openclasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
    }
}

class Car {
    public void print() {
        System.out.println(getClass().getSimpleName());
    }
}
