package com.chudnikau.generic;

public abstract class SumIntValues<T> {

    public Integer add(T a, T b) {
        return (Integer) a + (Integer) b;
    }

    public abstract Double difference(T a, T b);
}
