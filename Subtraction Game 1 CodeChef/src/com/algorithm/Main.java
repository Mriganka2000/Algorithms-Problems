package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = arr[0];
            for (int i = 0; i < n; i++) {
                result = gcd(result, arr[i]);
            }

            System.out.println(result);
        }
    }
}
