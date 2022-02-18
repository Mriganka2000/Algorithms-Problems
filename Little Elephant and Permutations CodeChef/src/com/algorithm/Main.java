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

            int inver = 0, local = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        inver++;
                    }
                }
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    local++;
                }
            }

            if (local == inver) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
