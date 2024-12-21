package org.example.concurrency.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {

    Queue<Object> queue;

    public Store() {
        this.queue = new ConcurrentLinkedQueue<>();
    }
}
