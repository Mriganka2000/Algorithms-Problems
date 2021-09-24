package com.Releationship;

import java.util.Scanner;

public class Main {

//    Time Complexity :- O(2^n)
    public static int countSubset(int arr[], int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return countSubset(arr, n-1, sum) + countSubset(arr, n-1, sum - arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();;
        }
        int sum = scanner.nextInt();
        System.out.println(countSubset(arr, n, sum));
    }
}
