package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int min(int a, int b, int c) {
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        return min;
    }

    public static int editDistance(String str1, String str2) {
        int[][] table = new int[str1.length() + 1][str2.length() + 1];
        int m = str1.length(), n = str2.length();

        for (int i = 0; i <= m; i++) {
            table[i][0] = i;
        }

        for (int i = 0; i <= n; i++) {
            table[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1];
                }
                else {
                    table[i][j] = 1 + min(table[i-1][j-1], table[i][j-1], table[i-1][j]);
                }
            }
        }

        return table[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string :- ");
        String str1 = scanner.next();
        System.out.print("Enter the second string :- ");
        String str2 = scanner.next();
        System.out.println("The min edit distance is :- " + editDistance(str1, str2));
    }
}
