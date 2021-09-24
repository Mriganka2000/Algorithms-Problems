package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t != 0) {
            long j = 1, sum = 0;
            int n = scanner.nextInt();
            long x = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; arr[i] % j == 0; i = i % n) {
                sum = sum + arr[i];
                if (i + 1 == n) {
                    j = j * x;
                }
                i++;
            }

            System.out.println(sum);

            t--;
        }
    }
}
