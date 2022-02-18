package com.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> closestPair(int arr1[], int arr2[], int target) {
        int diff = Integer.MAX_VALUE;
        int left = 0, right = arr2.length - 1;
        int res_left = 0, res_right = 0;

        ArrayList<Integer> result = new ArrayList<>();
        while (left < arr1.length && right >= 0) {
            if (Math.abs(arr1[left] + arr2[right] - target) < diff) {
                res_left = arr1[left];
                res_right = arr2[right];
                diff = Math.abs(arr1[left] + arr2[right] - target);
            }
            else if (arr1[left] + arr2[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }

        result.add(res_left);
        result.add(res_right);

        return result;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(closestPair(arr1, arr2, target));
    }
}
