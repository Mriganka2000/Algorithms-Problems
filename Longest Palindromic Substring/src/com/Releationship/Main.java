package com.Releationship;

import java.util.Scanner;

public class Main {

    public static String longestPalindrome(String str) {
        int l = str.length();
        boolean[][] table = new boolean[l][l];

        int maxLength = 1, start = l - 1;
        for (int i = 0; i < l; i++) {
            table[i][i] = true;
        }

        for (int i = 0; i < l - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i+1] = true;

                if (maxLength == 1) {
                    maxLength = 2;
                    start = i;
                }
            }
        }

        for (int width = 3; width <= l; width++) {
            for (int i = 0; i <= l - width; i++) {
                int j = i + width - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (width > maxLength) {
                        maxLength = width;
                        start = i;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String str = scanner.next();
        System.out.println(longestPalindrome(str));
    }
}
