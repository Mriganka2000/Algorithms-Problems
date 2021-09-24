package com.Algorithm;

import java.util.Scanner;

public class Main {

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && list[i] < list[j] + 1) {
                    list[i] = list[j] + 1;
                }
            }
        }

        return max(list, n);
    }

    private static int max(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array :- ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Length of the longest increasing subsequence :- " + lengthOfLIS(arr));
    }
}
