package com.chudnikau.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
    }
}
