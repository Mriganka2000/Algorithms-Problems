package com.algorithm;

public class Main {

    public static int unboundedKnapsack(int[] wt, int[] val, int maxWeight) {
        int[] table = new int[maxWeight + 1];

        for (int i = 0; i <= maxWeight; i++) {
            for (int j = 0; j < wt.length; j++) {
                if (i >= wt[j]) {
                    table[i] = Math.max(table[i], table[i - wt[j]] + val[j]);
                }
            }
        }

        return table[maxWeight];
    }

    public static void main(String[] args) {
        int maxWeight = 100;
        int[] val = {10, 30, 20};
        int[] wt = {5, 10, 15};
        System.out.println(unboundedKnapsack(wt, val, maxWeight));
    }
}
