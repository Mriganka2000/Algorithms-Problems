package com.algorithm;

public class Main {

    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }
        if (arr[n - 1] > sum) {
            return isSubsetSum(arr, n - 1, sum);
        }
        return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }

    public static boolean isSubsetSumDP(int[] arr, int n, int sum) {
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

//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= sum; j++) {
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }

        return table[n][sum];
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(set, set.length, sum));
        System.out.println(isSubsetSumDP(set, set.length, sum));
    }
}
