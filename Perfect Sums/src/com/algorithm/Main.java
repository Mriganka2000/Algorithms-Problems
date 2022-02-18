package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int solve(int input1, int[] input2, int input3) {
        int[][] dp = new int[input1 + 1][input3 + 1];

        for (int i = 0; i <= input1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= input3; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= input1; i++) {
            for (int j = 1; j <= input3; j++) {
                if (input2[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - input2[i - 1]];
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[input1][input3];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int val = scanner.nextInt();
        System.out.println(solve(n, arr, val));
    }
}
