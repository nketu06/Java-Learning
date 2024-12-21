package org.example.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//  1 creating a thread example using runnable
//        for(int i=0; i<100; i++) {
//            Thread t1 = new Thread(new MyRunnable());
//            t1.start();
//        }

//        using executer service with runnable
//
//      2  ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(new MyRunnable());
//        }
//        executorService.shutdown();


        // 3 using callable
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

//       4 *** adder subtracted issue
//        Lock lock = new ReentrantLock(); // to solve this issue
//        Counter counter = new Counter();
//        Thread t1= new Thread(new Adder(counter,lock));
//        Thread t2= new Thread(new subs(counter,lock));
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println(counter.count);

        // 5 mergeSort
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSort ms = new MergeSort(Arrays.asList(8, 1, 4, 2, 11, 3, 0, 5, 6, 10, 11, 0, 18, 20, 11, 2),executorService);
        System.out.println(executorService.submit(ms).get());
        executorService.shutdown();



    }
}
