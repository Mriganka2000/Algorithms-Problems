package com.algorithm;

public class Main {

    public static void merge(int[] arr, int start, int mid, int end) {
        int n = start, i = start, j = mid + 1;
        int[] temp = new int[arr.length];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[n++] = arr[i++];
            }
            else {
                temp[n++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[n++] = arr[i];
            i++;
        }

        while (j <= end) {
            temp[n++] = arr[i];
            i++;
        }

        for (int k = start; k <= end; k++) {
            arr[k] = temp[k];
        }
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid - 1);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

