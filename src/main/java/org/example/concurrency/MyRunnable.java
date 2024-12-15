package org.example.concurrency;

import java.util.SortedMap;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable running..."+Thread.currentThread().getName());
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
