package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int binarySearch(int arr[], int end, int val) {
        int start = 0, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] > val) {
                end = mid - 1;
            }
            else if (arr[mid] < val) {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search :- ");
        int val = scanner.nextInt();

        System.out.println("The first occurrence is :- " + (binarySearch(arr, n-1, val) + 1));
    }
}
