package org.example.concurrency.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Store store;
    Semaphore ps;
    Semaphore cs;

    public Producer(Store store, Semaphore ps, Semaphore cs) {
        this.store = store;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {

        try {
            ps.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Producer "+Thread.currentThread().getName() + ": Producer started "+ store.queue.size());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.queue.add(new Object());
        cs.release();

    }
}
