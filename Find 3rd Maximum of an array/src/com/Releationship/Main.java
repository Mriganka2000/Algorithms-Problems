package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static int thirdMax(int[] nums) {
        long  max = Long.MIN_VALUE;
        long  secondMax = Long.MIN_VALUE;
        long  thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max  = nums[i];
            }
            else if(nums[i] > secondMax && max > nums[i]) {
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if(nums[i] > thirdMax && secondMax > nums[i]) {
                thirdMax = nums[i];
            }
        }
        return thirdMax != Long.MIN_VALUE ? (int)thirdMax : (int)max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array :- ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Reverse is :- " + thirdMax(arr));
    }
}
