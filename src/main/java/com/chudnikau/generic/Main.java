package com.chudnikau.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SumArray<Integer> integerSumArray = new SumArray<>();
        System.out.println(integerSumArray.calc(new Integer[]{1, 2, 3, 4}));
        System.out.println(integerSumArray.average(new ArrayList<Integer>() {
            List<Integer> fill() {
                add(1);
                add(2);
                add(3);
                return this;
            }
        }.fill()));

        Integer[] arr = { 1, 2, 3 };
        integerSumArray.max(arr);

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
