package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int maxPage(int arr[], int n, int k) {
        if (k == 1) {
            return sum(arr, 0, n-1);
        }
        if (n == 1) {
            return arr[0];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            result = Math.min(result, Math.max(maxPage(arr, i, k-1), sum(arr, i, n-1)));
        }
        return result;
    }

    public static int sum(int arr[], int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(maxPage(arr, n, k));
    }
}
