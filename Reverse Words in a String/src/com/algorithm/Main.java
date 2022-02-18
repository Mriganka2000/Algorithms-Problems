package com.algorithm;

import java.util.Scanner;

public class Main {

    public static String reverseWords(String str) {
        StringBuilder sb = new StringBuilder();
        int i = str.length() - 1, j ;

        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                i--;
            }
            else {
                j = i;
                while (i >= 0 && str.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(str.charAt(k));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseWords(str));
    }
}
