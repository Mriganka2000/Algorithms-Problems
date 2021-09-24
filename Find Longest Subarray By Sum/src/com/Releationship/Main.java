package com.Releationship;

public class Main
{
    public static int[] findLongestSubarrayBySum(int arr[], int s) {
        int [] result = new int[] {-1};

        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < arr.length) {
            sum = sum + arr[right];
            while (left < right && sum > s) {
                sum = sum - arr[left];
                left++;
            }
            if(sum == s && (result.length == 1 || (result[1] - result[0]) < (right - left))) {
                result = new int[] { left+1, right+1 };
            }
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10 };
        int s = 15;
        int [] result = findLongestSubarrayBySum(arr, s);
        System.out.println("Position is :- " + result[0] + " "+ result[1]);
    }
}