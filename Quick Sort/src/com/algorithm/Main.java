package com.algorithm;

public class Main  {

    public static int partition(int[] arr, int start, int end) {
        int index = start;
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            sort(arr, start, index - 1);
            sort(arr, index + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

