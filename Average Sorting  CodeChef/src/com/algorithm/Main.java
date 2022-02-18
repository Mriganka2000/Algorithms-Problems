package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean decreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    decreasing = false;
                }
            }

            if (decreasing) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
