package com.Releationship;

import java.util.Scanner;

public class Main {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        return longestCommonPrefix(str, 0, str.length - 1);
    }

    private String longestCommonPrefix(String[] str, int start, int end) {
        if (start == end) {
            return str[start];
        }
        else {
            int mid = (start + end) / 2;
            String left = longestCommonPrefix(str, start, mid);
            String right = longestCommonPrefix(str, mid+1, end);
            return compare(left, right);
        }
    }

    private String compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        String[] str = new String[n];

        System.out.println("Enter the strings :- ");
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        Main m = new Main();
        System.out.println("Longest Common Prefix is :- " + m.longestCommonPrefix(str));;
    }
}

