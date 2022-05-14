package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int len = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val != 0) {
                len++;
                if (max < len) {
                    max = len;
                }
            }
            else {
                len = 0;
            }
        }
        System.out.println(max);
    }
}
