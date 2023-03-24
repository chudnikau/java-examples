package com.chudnikau.generic;

public class Main {
    public static void main(String[] args) {

        System.out.println(new SumIntValues<Double>() {
            @Override
            public Double difference(Double a, Double b) {
                return a - b;
            }
        }.add(20.0, 5.0));

        System.out.println(new SumIntValues<Double>() {
            @Override
            public Double difference(Double a, Double b) {
                return a - b;
            }
        }.difference(20.0, 5.0));

    }
}
