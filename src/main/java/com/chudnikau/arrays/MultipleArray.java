package com.chudnikau.arrays;

import java.util.Arrays;

public class MultipleArray {

    int[][] multiple;
    int[][][] array = new int[1][3][5];

    Pet[] pets = new Pet[10];

    public MultipleArray() {
        multiple = new int[][] {
                {1, 2},
                {2, 4},
        };
    }

    public void print() {
        System.out.println(Arrays.deepToString(multiple));
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(pets));
    }
}
