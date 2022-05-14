package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Pair[] temp;
    public static int[] count;

    private static void merge(Pair[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;

        while (i <= mid && j <= end) {
            if (arr[i].val > arr[j].val) {
                count[arr[i].ind] += (end - j + 1);
                temp[k] = arr[i++];
            }
            else {
                temp[k] = arr[j++];
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }

    public static void mergeSort(Pair[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
	    int[] num = {5, 2, 6, 1};
        Pair[] arr = new Pair[num.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(num[i], i);
        }

        temp = new Pair[arr.length];
        count = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);

        List<Integer> list = new ArrayList<>();
        for (int item : count) {
            list.add(item);
        }

        System.out.println(list);
    }
}
