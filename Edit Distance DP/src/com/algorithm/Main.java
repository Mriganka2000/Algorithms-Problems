package com.algorithm;

public class Main {

    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= a && b <= c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static int maxEditDistance(String str1, String str2) {
        int[][] table = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0) {
                    table[i][j] = j;
                }
                else if (j == 0) {
                    table[i][j] = i;
                }
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                }
                else {
                    table[i][j] = min(table[i - 1][j - 1], table[i - 1][j], table[i][j - 1]) + 1;
                }
            }
        }

        return table[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(maxEditDistance(str1, str2));
    }
}
