package org.example.concurrency.ProducerConsumer;

import java.util.concurrent.Semaphore;

/**
This approach is efficient, avoids busy waiting, and ensures proper coordination between producers and consumers.
 */

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Semaphore cs = new Semaphore(0);
        Semaphore ps = new Semaphore(5);

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Consumer(store, cs, ps));
            t.start();

        }
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Producer(store, ps, cs));
            t.start();
        }
    }
}
