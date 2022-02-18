package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int mark = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                mark = i - 1;
                break;
            }
        }

        if (mark == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int index = -1;
        for (int i = nums.length - 1; i >= mark + 1; i--) {
            if (nums[i] > nums[mark]) {
                index = i;
                break;
            }
        }

        swap(nums, mark, index);

        reverse(nums, mark + 1, nums.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
	    int[] num = new int[n];
        System.out.println("Enter the array elements :- ");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        nextPermutation(num);
        System.out.println("Next permutation :- ");
        for (int item : num) {
            System.out.print(item);
        }
    }
}
