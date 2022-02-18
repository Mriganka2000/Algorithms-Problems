package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean subsetSum(int[] arr, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] > sum) {
            return subsetSum(arr, n - 1, sum);
        }
        return subsetSum(arr, n - 1, sum) || subsetSum(arr, n - 1, sum - arr[n - 1]);
    }

    public static boolean subsetSum(int[] arr, int sum) {
        boolean[][] table = new boolean[sum + 1][arr.length + 1];

        for (int i = 0; i <= arr.length; i++) {
            table[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            table[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= arr.length; j++) {
                table[i][j] = table[i][j - 1];
                if (i >= arr[j - 1]) {
                    table[i][j] = table[i][j] || table[i - arr[j - 1]][j - 1];
                }
            }
        }

        return table[sum][arr.length];
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean flag = subsetSum(arr, m);
            if (flag) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
