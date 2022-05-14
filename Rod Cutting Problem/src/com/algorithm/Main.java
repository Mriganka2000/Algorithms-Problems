package com.algorithm;

public class Main {

    public static int cuttingRod(int[] arr) {
        int[] val = new int[arr.length + 1];
        val[0] = 0;

        for (int i = 1; i <= arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, arr[j] + val[i - j - 1]);
            }
            val[i] = max;
        }

        return val[arr.length];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cuttingRod(arr));
    }
}
