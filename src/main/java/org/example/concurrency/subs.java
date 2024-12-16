package org.example.concurrency;

import java.util.concurrent.locks.Lock;

public class subs implements Runnable {
    Counter mycounter;
    Lock lock;

    public subs(Counter counter) {
        mycounter = counter;
    }
    public subs(Counter counter, Lock lock) {
        this.mycounter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            mycounter.count--;
            lock.unlock();
        }

    }
}
