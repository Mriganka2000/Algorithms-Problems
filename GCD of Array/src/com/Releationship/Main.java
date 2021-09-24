package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);
            if (result == 1) {
                break;
            }
        }
        System.out.println(result);
    }
}
