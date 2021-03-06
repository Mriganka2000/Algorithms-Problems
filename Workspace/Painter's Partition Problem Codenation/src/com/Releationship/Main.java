package com.Releationship;

public class Main {

    public static int sum(int[] arr, int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            count += arr[i];
        }
        return count;
    }

    public static int findMax(int[] arr, int n, int k) {
        int[][] dp = new int[k + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dp[1][i] = sum(arr, 0, i - 1);
        }

        for (int i = 0; i <= k; i++) {
            dp[i][1] = arr[0];
        }

        for (int i = 2; i <= k; i++) {
            for (int j = 2; j <= n; j++) {
                int best = Integer.MAX_VALUE;
                for (int p = 1; p <= j; p++) {
                    best = Math.min(best, Math.max(dp[i - 1][p], sum(arr, p, j - 1)));
                }
                dp[i][j] = best;
            }
        }

        return dp[k][n];
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 60, 50, 30, 40 };
        int n = arr.length;
        int k = 3;
        System.out.println(findMax(arr, n, k));
    }
}
