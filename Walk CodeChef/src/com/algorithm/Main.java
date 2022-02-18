package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            int max = 0;
            for (int i = 1; i <= n; i++) {
                int val = arr[i] + (i - 1);
                max = Math.max(max, val);
            }
            System.out.println(max);
        }
    }
}
