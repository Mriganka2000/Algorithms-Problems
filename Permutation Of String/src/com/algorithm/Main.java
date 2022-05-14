package com.algorithm;

import java.util.Scanner;

public class Main {

    private static void swap(char[] str, int i, int left) {
        char temp = str[i];
        str[i] = str[left];
        str[left] = temp;
    }

    public static void print(char[] str) {
        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printPermutations(char[] str, int left, int right) {
        if (left == right) {
            print(str);
        }

        for (int i = left; i <= right; i++) {
            swap(str, i, left);
            printPermutations(str, left + 1, right);
            swap(str, i, left);
        }
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();
        printPermutations(arr, 0, str.length() - 1);
    }
}
