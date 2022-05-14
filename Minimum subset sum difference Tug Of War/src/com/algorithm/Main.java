package com.algorithm;

public class Main {

    public static int tugOfWar(int[] arr, int n) {
        int sum = 0;

        for (int item : arr) {
            sum += item;
        }

        boolean[][] table = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            table[i][0] = true;
        }

        for (int i = 1; i <= sum; i++) {
            table[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                }
                if (arr[i - 1] <= j) {
                    table[i][j] = table[i - 1][j] || table[i - 1][j - arr[i - 1]];
                }
            }
        }

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < sum / 2; i++) {
            int first = i;
            int second = sum - i;
            if (table[n][i] && diff > Math.abs(first - second)) {
                diff = Math.abs(first - second);
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        System.out.println(tugOfWar(arr, arr.length));
    }
}
