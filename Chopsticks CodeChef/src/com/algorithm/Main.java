package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] <= d) {
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}
