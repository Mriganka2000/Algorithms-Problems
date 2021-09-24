package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int majorityElement(int arr[]) {
        int major = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (major == arr[i]) {
                count++;
            }
            else {
                count --;
            }
            if (count == 0) {
                count = 1;
                major = arr[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == major) {
                counter++;
            }
        }

        if (counter > arr.length / 2) {
            return major;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = majorityElement(arr);
        if (result != -1) {
            System.out.println("The majority element is :- " + result);
        }
        else {
            System.out.println("No majority element");
        }
    }
}
