package com.algorithm;

public class Main {

    public static int result = 0;

    public static void solve(int[] arr, int j, int n) {
        if(n == 0) {
            result++;
            return;
        }

        else if(n < 0) {
            return;
        }

        else {
            for (int i = j; i < arr.length; i++) {
                solve(arr, i, n - arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 20, 17, 11, 45};
        int n = 55;
        solve(arr, 0, n);
        System.out.println(result);
    }
}
