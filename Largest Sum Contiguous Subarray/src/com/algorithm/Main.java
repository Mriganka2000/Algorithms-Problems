package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int maxSumSubArray(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE, maxHere = 0;

        for (int item : arr) {
            maxHere = maxHere + item;
            if (maxHere < 0) {
                maxHere = 0;
            }
            if (maxHere > maxSoFar) {
                maxSoFar = maxHere;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSumSubArray(arr));
    }
}
