package com.chudnikau.threads;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        NumberAccumulator numberAccumulator = new NumberAccumulator(0);

        ExecutorService executorService = Executors.newCachedThreadPool();

        // Thread 1
        executorService.execute(
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                for (int n = 0; n < 100; n++) {
                                    numberAccumulator.add(new Random().nextInt(100) + n);
                                }
                            }
                        }
                ));

        // Thread 2
        executorService.execute(
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                for (int n = 0; n < 1000; n++) {
                                    numberAccumulator.add(new Random().nextInt(100) + n);
                                }
                            }
                        }
                ));

        Thread.sleep(100);

        executorService.shutdown();

        System.out.println(numberAccumulator.printAccumulatedValue());

        // Future

        ExecutorService futureExecutorService = Executors.newCachedThreadPool();

        Future<String> future = futureExecutorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Book name";
            }
        });

        futureExecutorService.shutdown();

        System.out.println(future.get());

    }
}
