package com.chudnikau.generic;

import java.util.List;

public class SumArray<T extends Number> {

    public double calc(T[] array) {
        double sum = 0;
        for (T v : array) {
            sum = sum + v.doubleValue();
        }
        return sum;
    }

    public double average(List<? extends Integer> list) {
        double res = 0;
        for (Integer v : list) {
            res = res + v / (double) list.size();
        }
        return res;
    }

    public <M extends Integer> void max(M[] array) {
        System.out.println("max");
    }

}
