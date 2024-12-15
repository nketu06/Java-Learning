package org.example.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//  creating a thread example using runnable
//        for(int i=0; i<100; i++) {
//            Thread t1 = new Thread(new MyRunnable());
//            t1.start();
//        }

//        using executer service with runnable
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new MyRunnable());
//        }
//        executorService.shutdown();


        // using callable
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ArrayList<Future<Integer>> addition = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            Future<Integer> submit = executorService.submit(new MyCallable(i, i + 1));
//            addition.add(submit);
//        }
//
//        for (Future<Integer> future : addition) {
//            System.out.println(future.get());
//        }
//        executorService.shutdown();

    }
}
