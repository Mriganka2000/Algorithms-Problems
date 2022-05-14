package com.algorithm.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            heap.add(stone);
        }

        while (heap.size() > 1) {
            int x = heap.remove();
            int y = heap.remove();

            if (x != y) {
                heap.add(Math.abs(x - y));
            }
        }

        return (heap.size() == 1 ? heap.remove() : 0);
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
}
