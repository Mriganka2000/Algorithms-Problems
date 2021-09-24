package com.company;

import java.util.Scanner;

public class Main {

    public static int candy(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = 1;
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.max(left[i], right[i]);
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
        System.out.println(candy(arr));
    }
}
