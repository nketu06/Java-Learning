package org.example.concurrency;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Counter mycounter;
    Lock lock;

    public Adder(Counter counter) {
        mycounter = counter;
    }
    public Adder(Counter counter, Lock lock) {
        this.lock = lock;
        this.mycounter = counter;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            mycounter.count++;
            lock.unlock();
        }

    }
}
