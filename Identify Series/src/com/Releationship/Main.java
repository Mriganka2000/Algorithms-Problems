package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int checkSeries(int[] arr) {
        char ch = '\0';

        if ((arr[arr.length - 1] - arr[arr.length - 2]) == (arr[arr.length - 2] - arr[arr.length - 3])) {
            ch = 'a';
        }
        else if ((arr[arr.length - 1] / arr[arr.length - 2]) == (arr[arr.length - 2] / arr[arr.length - 3])) {
            ch = 'g';
        }
        else if (arr[arr.length - 3] + arr[arr.length - 2] == arr[arr.length - 1]) {
            ch = 'f';
        }

        if (ch == 'a') {
            return (arr[arr.length - 1] + (arr[arr.length - 1] - arr[arr.length - 2]));
        }
        else if (ch == 'g') {
            return (arr[arr.length - 1] * (arr[arr.length - 1] / arr[arr.length - 2]));
        }
        else if (ch == 'f') {
            return (arr[arr.length - 1] + arr[arr.length - 2]);
        }
        else {
            return -999;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(checkSeries(arr));
    }
}
