package com.algorithm;

import java.util.Arrays;

public class Main {

    public static int toyCount(int k, int[] arr) {
        Arrays.sort(arr);

        int count = 0, sum = 0;

        for (int item : arr) {
            if (sum + item <= k) {
                sum = sum + item;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 50;
        int[] arr = {1, 12, 5, 111, 200, 1000, 10};

        System.out.println(toyCount(k, arr));
    }
}
