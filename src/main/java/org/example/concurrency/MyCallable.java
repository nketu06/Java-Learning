package org.example.concurrency;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<java.lang.Integer> {
    int a;
    int b;

    MyCallable(int a, int b){
        this.a = a;
        this.b = b;

    }

    @Override
    public Integer call() throws Exception {
        return a+b;
    }
}
