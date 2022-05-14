package com.algorithm;

import java.util.Arrays;

public class Main
{
    public static int lis(int[] arr) {
        int[] table = new int[arr.length];

        Arrays.fill(table, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && table[i] < table[j] + 1) {
                    table[i] = table[j] + 1;
                }
            }
        }

        int max = 0;
        for (int item : table) {
            if (max < item) {
                max = item;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println(lis(arr));
    }
}

