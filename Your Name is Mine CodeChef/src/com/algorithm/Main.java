package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean matchStrings(String str1, String str2) {
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else {
                i++;
            }
        }

        return j == str2.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str1 = scanner.next();
            String str2 = scanner.next();

            if (matchStrings(str1, str2) || matchStrings(str2, str1)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
