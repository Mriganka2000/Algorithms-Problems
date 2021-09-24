package com.Releationship;

public class Main {

    public static int sum(int nums[], int div) {
        int sum = 0;
        for (int item : nums) {
            sum += item / div + (item % div == 0 ? 0 : 1);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int end  = 2;
        while (sum(nums, end) > threshold) {
            end <<= 1;
        }
        int start = end >> 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (sum(nums, mid) > threshold) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,5,9}, threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
