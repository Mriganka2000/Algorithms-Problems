package com.Releationship;

import java.util.Arrays;

public class Main {

    public static void findTriplet(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 2; i--) {
            int l = 0;
            int r = i-1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    System.out.println("Yes present :- " + Math.sqrt(arr[l]) + " " + Math.sqrt(arr[r]) + " " + Math.sqrt(arr[i]));
                    return;
                }
                else if (arr[l] + arr[r] < arr[i]) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        System.out.println("Not present");
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        findTriplet(arr);
    }
}
