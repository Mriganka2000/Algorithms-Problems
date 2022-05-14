package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean hasTriplet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int a = arr[i] * arr[i];
                    int b = arr[j] * arr[j];
                    int c = arr[k] * arr[k];
                    if (a + b == c || b + c == a || c + a == b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(hasTriplet(arr));
    }
}
