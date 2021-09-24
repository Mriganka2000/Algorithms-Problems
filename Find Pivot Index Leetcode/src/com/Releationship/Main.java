package com.Releationship;

import java.util.Scanner;

public class Main {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for(int i : nums) {
            sum += i;
        }
        for(int i = 0; i < nums.length; i++) {
            if(leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (pivotIndex(arr) == -1) {
            System.out.println("No pivot index is present");
        }
        else {
            System.out.println("Pivot index is :- " + pivotIndex(arr));
        }
    }
}
