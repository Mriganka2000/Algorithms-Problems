package com.company;

import java.util.Scanner;

public class Main {

    public static int find(int arr[], int begin, int end, int val) {
        int result = -1;

        while(begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == val) {
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] < val) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int val = scanner.nextInt();
        System.out.println("First occurrence is :- " + find(arr, 0, n-1, val));
    }
}
