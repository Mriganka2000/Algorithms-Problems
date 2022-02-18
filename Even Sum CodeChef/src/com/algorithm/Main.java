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
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            if (sum % 2 == 0) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
    }
}
