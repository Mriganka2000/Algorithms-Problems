package com.company;

import java.util.Scanner;

public class Main {

    public static int waterCount(int arr[]) {
        int leftPrefix[] = new int[arr.length];
        int rightPrefix[] = new int[arr.length];
        int water = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                leftPrefix[i] = arr[i];
            }
            else {
                leftPrefix[i] = Math.max(arr[i], leftPrefix[i-1]);
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                rightPrefix[i] = arr[i];
            }
            else {
                rightPrefix[i] = Math.max(arr[i], rightPrefix[i+1]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            water += Math.min(rightPrefix[i], leftPrefix[i]) - arr[i];
        }

        return water;
    }

    public static int waterCountOpt(int arr[]) {
        int l = 0, r = arr.length-1, leftMax = 0, rightMax = 0, water = 0;

        while (l <= r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] >= leftMax) {
                    leftMax = arr[l];
                }
                else {
                    water += (leftMax - arr[l]);
                }
                l++;
            }
            else {
                if (arr[r] >= rightMax) {
                    rightMax = arr[r];
                }
                else {
                    water += (rightMax - arr[r]);
                }
                r--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterCount(arr));
        System.out.println(waterCountOpt(arr));
    }
}
