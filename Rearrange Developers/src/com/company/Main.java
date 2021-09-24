package com.company;

import java.util.Arrays;

public class Main {

    public static void rearrange(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 1; i < n; i+=2) {
            if (arr[i-1] > arr[i]) {
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            if (i + 1 < n && arr[i+1] > arr[i]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
	    int arr[] = {7, 2, 1, 4, 5, 3, 6};
	    rearrange(arr);
    }
}
