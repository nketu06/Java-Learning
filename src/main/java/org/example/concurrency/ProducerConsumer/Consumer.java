package org.example.concurrency.ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Store store;
    Semaphore cs;
    Semaphore ps;

    public Consumer(Store store, Semaphore cs, Semaphore ps) {
        this.store = store;
        this.cs = cs;
        this.ps = ps;
    }

    @Override
    public void run() {

        try {
            cs.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Consumer "+Thread.currentThread().getName() + ": Consumer started "+ store.queue.size());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.queue.poll();
        ps.release();

    }

}
