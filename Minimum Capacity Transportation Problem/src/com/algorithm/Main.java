package com.algorithm;

import java.util.Scanner;

public class Main {

    public static long binarySearch(int[] arr, int k) {
        long left = maxVal(arr), right = sumOf(arr), ans = 0;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            if (numOfRides(arr, mid) > k) {
                left = mid + 1;
            }
            else {
                ans = mid;
                right = mid - 1;
            }
        }
        
        return ans;
    }

    private static int numOfRides(int[] arr, long capacity) {
        int ans = 1;
        long weight = 0;
        for (int item : arr) {
            if ((weight + item) <= capacity) {
                weight += item;
            } else {
                ans++;
                weight = item;
            }
        }
        return ans;
    }

    private static long maxVal(int[] arr) {
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static long sumOf(int[] arr) {
        long sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(binarySearch(arr, k));
    }
}
