package com.chudnikau.threads;

public class NumberAccumulator {

    private Integer accumulator;

    public NumberAccumulator(Integer accumulator) {
        this.accumulator = accumulator;
    }

    public synchronized void add(Integer value) {
        accumulator=value;
    }

    public synchronized String printAccumulatedValue() {
        return accumulator.toString();
    }

}
