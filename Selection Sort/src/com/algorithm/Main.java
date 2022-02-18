package com.algorithm;

public class Main {

    public static int position(int[] arr, int start) {
        int pos = start, min = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = position(arr, i);
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
