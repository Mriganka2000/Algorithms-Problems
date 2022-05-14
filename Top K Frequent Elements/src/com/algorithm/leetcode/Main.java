package com.algorithm.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static int[] topKFrequent(int[] num, int k) {
        if (k == num.length) {
            return num;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : num) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        for (int item : map.keySet()) {
            queue.add(item);
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,1,1,2,2,3};
        int k = 2;
        int[] res = topKFrequent(num, k);

        for (int item : res) {
            System.out.println(item);
        }
    }
}
