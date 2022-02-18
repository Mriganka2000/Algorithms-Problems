package com.algorithm;

public class Main {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
