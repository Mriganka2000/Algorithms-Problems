package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- != 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;
            for (int i = n - 1; i >= 0; i -= 2) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
