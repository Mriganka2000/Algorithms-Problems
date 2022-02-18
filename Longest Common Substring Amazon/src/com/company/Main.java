package com.company;

import java.util.Scanner;

public class Main {

    public static int longestCommonSubString(String str1, String str2, int m, int n, int count) {
        if (m <= 0 || n <= 0) {
            return count;
        }
        int lcsCount1 = count;
        if (str1.charAt(m-1) == str2.charAt(n-1)) {
            lcsCount1 = longestCommonSubString(str1, str2, m-1, n-1, count + 1);
        }
        int lcsCount2 = longestCommonSubString(str1, str2, m, n-1, 0);
        int lcsCount3 = longestCommonSubString(str1, str2, m-1, n, 0);

        return Math.max(lcsCount1, Math.max(lcsCount2, lcsCount3));
    }

    public static int longestCommonSubString(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(longestCommonSubString(str1, str2, str1.length(), str2.length(), 0));
        System.out.println(longestCommonSubString(str1, str2));
    }
}
