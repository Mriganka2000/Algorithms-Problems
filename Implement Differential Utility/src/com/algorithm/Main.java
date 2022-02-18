package com.algorithm;

public class Main {

    public static void diff(String str1, String str2, int m, int n, int[][] table) {
        if (m > 0 && n > 0 && str1.charAt(m - 1) == str2.charAt(n - 1)) {
            diff(str1, str2, m - 1, n - 1, table);
            System.out.print(" " + str1.charAt(m - 1));
        }
        else if (n > 0 && (m == 0 || table[m][n - 1] >= table[m - 1][n])) {
            diff(str1, str2, m, n - 1, table);
            System.out.print(" +" + str2.charAt(n - 1));
        }
        else if(m > 0 && (n == 0 || table[m][n - 1] < table[m - 1][n])) {
            diff(str1, str2, m - 1, n, table);
            System.out.print(" -" + str1.charAt(m - 1));
        }
    }

    public static int[][] findLCS(String str1, String str2, int m, int n) {
        int[][] table = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                }
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                }
                else {
                    table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
                }
            }
        }

        return table;
    }

    public static void main(String[] args) {
        String X = "XMJYAUZ";
        String Y = "XMJAATZ";

        int[][] lookup = findLCS(X, Y, X.length(), Y.length());

        diff(X, Y, X.length(), Y.length(), lookup);
    }
}
