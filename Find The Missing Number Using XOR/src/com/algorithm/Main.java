package com.algorithm;

public class Main
{
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMissing(int[] arr) {
        int xor1 = arr[0];
        int xor2 = 1;
        int max = findMax(arr);

        for (int i = 2; i <= max; i++) {
            xor2 = xor2 ^ i;
        }

        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 2, 8, 4, 5 };
        System.out.println(findMissing(arr));
    }
}
