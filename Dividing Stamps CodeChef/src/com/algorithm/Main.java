package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int req = (n * (n + 1)) / 2;
        if (req == sum) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
