package com.chudnikau.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayInit {

    public void initArrays() throws InterruptedException {
        int[] a = new int[10];
        int[] b = {1, 2, 3, 4};
        int c[] = new int[1];

        int[] m = b;

        System.out.println(Arrays.toString(m));

        m[0] = 100;

        System.out.println(Arrays.toString(m));

        // создание безразмерного массиваэ

        Random random = new Random();
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        Integer[] noSizeArray = new Integer[random.nextInt(20)];
        Arrays.fill(noSizeArray, 1);
        System.out.println(Arrays.toString(noSizeArray));

        Object[] obj = new Object[]{new Integer(1), new Float(2), new Double(3)};

        printArray(obj);
        printArray(new Object[]{new ArrayInit(), new ArrayInit()});

//      f((Integer) 1000, 2, 3);
//       f(100);

    }

    private static void printArray(Object[] obj) {
        for (Object o : obj) {
            System.out.println(o);
        }
    }

    private static void f(Integer i, Integer... args) {
        System.out.println("f(Integer, Integer...)=" + i);
        for (Integer a : args) {
            System.out.println("f(Integer, Integer...)=" + a);
        }
    }

    private static void f(Integer... a) {
        System.out.println("f(Integer)" + a);
    }

}
