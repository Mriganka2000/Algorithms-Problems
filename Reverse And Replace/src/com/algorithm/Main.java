package com.algorithm;

import java.util.Scanner;

public class Main {

    public static String reverseReplace(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U' || str.charAt(i) == 'u') {
                sb.append(String.valueOf(count++));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        StringBuilder rev = sb.reverse();
        return rev.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseReplace(str));
    }
}
