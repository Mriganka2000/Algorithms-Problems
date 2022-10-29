package com.algorithm.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private static int size = 0;

    public static void insertHeap(int x) {
        if (size == 0) {
            maxHeap.add(x);
        }
        else {
            if (x < maxHeap.peek()) {
                maxHeap.add(x);
            }
            else {
                minHeap.add(x);
            }
        }
        size++;
        balanceHeaps();
    }

    //Function to balance heaps.
    public static void balanceHeaps() {
        if (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll());
        }
        else if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll());
        }
    }

    //Function to return Median.
    public static double getMedian() {
        if (size % 2 == 0) {
            double ans = (maxHeap.peek() + minHeap.peek()) / 2.0;
            return ans;
        }
        else if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        else {
            return minHeap.peek();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,15,1,3};

        for (int j : arr) {
            insertHeap(j);
            System.out.println(getMedian());
        }
    }
}