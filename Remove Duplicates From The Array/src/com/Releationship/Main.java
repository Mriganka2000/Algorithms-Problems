package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[n] != nums[j]) {
                n++;
                nums[n] = nums[j];
            }
        }

        System.out.println("The Elements are :- ");
        for(int i = 0; i <= n; i++) {
            System.out.println(nums[i]);
        }

        return n+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements :- ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The number of Elements remained :- " + removeDuplicates(arr));
    }
}
