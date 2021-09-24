package com.Releationship;

import java.util.Scanner;

public class Main {
    public static void moveZeroes (int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        System.out.println("Enter the elements :- ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
    }
}
