package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean isSubsequence(String str, String text) {
        if (str.isEmpty()) {
            return true;
        }
        int i = 0, j = 0;
        while (i < str.length() && j < text.length()) {
            if (str.charAt(i) == text.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if (i == str.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String text = scanner.nextLine();
        boolean val = isSubsequence(str, text);
        System.out.println(val);
    }
}
