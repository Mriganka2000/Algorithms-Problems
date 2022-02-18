package com.algorithm;

import java.util.Arrays;

public class Main {

    public static boolean search(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (x == arr[mid])
                return true;
            if (x > arr[mid])
                return search(arr, (mid + 1), high, x);
            else
                return search(arr, low, (mid - 1), x);
        }
        return false;
    }

    public static int countPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (search(arr, i + 1, arr.length - 1, arr[i] + k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3,1,4,1,5 };
        int k = 2;
        int val = countPairs(arr, k);
        System.out.println(val);
    }
}
