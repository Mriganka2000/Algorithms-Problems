package com.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void firstKElements(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int k = 3;
        firstKElements(arr, k);
    }
}
