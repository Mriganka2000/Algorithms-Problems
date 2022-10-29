package com.algorithm.java;

import java.util.Arrays;

public class Main {

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, 10001);
        }

        for (int[] edge : edges) {
            dp[edge[0]][edge[1]] = dp[edge[1]][edge[0]] = edge[2];
        }

        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j] > dp[i][k] + dp[k][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    }
                }
            }
        }

        int ans = -1;
        int min = Integer.MAX_VALUE;
        for (int u = 0; u < n; ++u) {
            int count = 0;
            for (int v = 0; v < n; ++v) {
                if (v != u && dp[u][v] <= distanceThreshold) {
                    ++count;
                }
            }
            if (count <= min) {
                min = count;
                ans = u;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int distanceThreshold = 4;

        System.out.println(findTheCity(n, edges, distanceThreshold));
    }

}