package com.chudnikau.threads.volatilevars;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        CommonClass commonClass = new CommonClass(0);
//        ReadCommonValue readCommonValue = new ReadCommonValue(commonClass);
//        WriteCommonValue writeCommonValue = new WriteCommonValue(commonClass);
//
//        Thread writeThread = new Thread(writeCommonValue);
//        writeThread.start();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            Thread readThread = new Thread(readCommonValue);
//            executorService.submit(readThread);
//            if (i % 2 == 0) {
//                writeThread.start();
//            }
//        }
//
//        executorService.shutdown();
        String s1 = "s1";
        String s2 = "s2";

        Object i1 = 1;
        Object i2 = 2;

        if (i1 == i1) {
            System.out.println("1");
        }
        System.out.println("2");
//        if (s1 = s2) {
//
//        }
    }
}
