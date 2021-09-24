package com.Releationship;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int k = 2;
        int n = arr.length;
        k = k % n;
        for (int i = 0; i < n; i++) {
            if(i < k) {
                System.out.println(arr[n + i - k] + " ");
            }
            else {
                System.out.println(arr[i-k] + " ");
            }
        }
    }
}
