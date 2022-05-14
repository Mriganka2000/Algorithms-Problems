package com.algorithm;

public class Main
{
    public static int maxWays(int[] coins, int target) {
        int[][] table = new int[coins.length + 1][target + 1];

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (i == 1 || j == 0) {
                    table[i][j] = 1;
                }
                else if (j >= coins[i - 1]) {
                    table[i][j] = table[i - 1][j] + table[i][j - coins[i - 1]];
                }
                else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }

        return table[coins.length][target];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int target = 7;
        System.out.println(maxWays(coins, target));
    }
}
