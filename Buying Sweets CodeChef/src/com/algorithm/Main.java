package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            int result = 0;
            int diff = sum - (sum / x) * x;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= diff) {
                    result = -1;
                }
            }
            if (result != -1) {
                result = sum / x;
            }

            System.out.println(result);
        }
    }
}
