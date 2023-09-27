package com.chudnikau.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        Integer a = 123;
        Integer b = 123;

        System.out.println(a == b);

        a = 100;

        System.out.println(a);
        System.out.println(b);

        new ArrayInit().initArrays();

        for (int v : array) {
            System.out.print(v);
        }

        System.out.println();

        System.out.println("Print arrays");

        Integer[] intArray = {1, 2, 3};
        int[] simpleIntArray = {4, 5, 6};

//        for (Integer v : intArray) {
//            System.out.println(v);
//        }
        System.out.println(Arrays.toString(intArray));

//        System.out.println(intArray.toString());
        System.out.println(Arrays.toString(simpleIntArray));

    }
}
