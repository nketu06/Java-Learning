package org.example.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MergeSort implements Callable<List<Integer>> {
    private final List<Integer> unsortedArray;
    ExecutorService executors;

    public MergeSort(List<Integer> unsortedArray, ExecutorService executors) {
        this.unsortedArray = unsortedArray;
        this.executors = executors;
    }

    public List<Integer> sort() throws ExecutionException, InterruptedException {
        int n = unsortedArray.size();
        if (n < 2) {
            return unsortedArray;
        }
        int middle = n / 2;
        List<Integer> leftUnsorted = new ArrayList<>(unsortedArray.subList(0, middle));
        List<Integer> rightUnsorted = new ArrayList<>(unsortedArray.subList(middle,n));

        Future<List<Integer>> leftSortedFuture = executors.submit( new MergeSort(leftUnsorted,executors));
        Future<List<Integer>> rightSortedFuture = executors.submit( new MergeSort(rightUnsorted, executors));

        // merge functionality

        List<Integer> sorted = new ArrayList<>();
        List<Integer> leftSorted = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();

        int i=0,j=0;
        while(i<leftSorted.size() && j<rightSorted.size()){
            if(leftSorted.get(i)<rightSorted.get(j)){
                sorted.add(leftSorted.get(i));
                i++;
            }else{
                sorted.add(rightSorted.get(j));
                j++;
            }
        }
        while(i<leftSorted.size()){
            sorted.add(leftSorted.get(i));
            i++;
        }
        while(j<rightSorted.size()){
            sorted.add(rightSorted.get(j));
            j++;
        }
        return sorted;
    }


    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }
}
