package com.algorithm.leetcode;

public class Main {

    public static int numTrees(int n) {
        int[] trees = new int[n + 1];
        trees[0] = trees[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                trees[i] += trees[j] * trees[i - j - 1];
            }
        }

        return trees[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }
}
