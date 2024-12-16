package org.example.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executor;

    TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }
        TreeSizeCalculator leftcal = new TreeSizeCalculator(root.left, executor);
        Future<Integer> left = this.executor.submit(leftcal);

        TreeSizeCalculator rightcal = new TreeSizeCalculator(root.right, executor);
        Future<Integer> right = this.executor.submit(rightcal);
        return left.get() + right.get() + 1;
    }
}