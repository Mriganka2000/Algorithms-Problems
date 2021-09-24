package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int lcs(String str1, String str2) {
        int[][] table = new int[str1.length() + 1][str2.length() + 1];
        int m = str1.length(), n = str2.length();

        for (int i = 0; i <= m; i++) {
            table[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            table[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                }
                else {
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }

        return table[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the 1st string :- ");
        String str1 = scanner.next();
        System.out.print("Enter the 2nd string :- ");
        String str2 = scanner.next();
        System.out.println("The length of common subsequence :- " + lcs(str1, str2));
    }
}
