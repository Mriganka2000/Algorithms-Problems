package com.algorithm;

import java.util.PriorityQueue;

public class Main {

    public static void findKSmallestElements(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int item : arr) {
            queue.add(item);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 23, 12, 9, 30, 2, 50 };
        findKSmallestElements(arr, 3);
    }
}
