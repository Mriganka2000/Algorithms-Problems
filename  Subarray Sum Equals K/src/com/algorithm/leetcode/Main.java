package com.algorithm.leetcode;

import java.util.HashMap;

public class Main {

    public static int subArraySum(int[] num, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, 1);

        for (int item : num) {
            sum += item;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
	    int[] num = {1, 1, 1};
        int k = 2;
        System.out.println(subArraySum(num, k));
    }
}
