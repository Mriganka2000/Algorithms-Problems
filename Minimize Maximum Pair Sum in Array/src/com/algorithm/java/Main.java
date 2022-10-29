package com.algorithm.java;

import java.util.Arrays;

public class Main {

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int start = 0, end = nums.length - 1;

        int max = Integer.MIN_VALUE;
        while (start < end) {
            if (nums[start] + nums[end] > max) {
                max = nums[start] + nums[end];
            }
            start++;
            end--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}