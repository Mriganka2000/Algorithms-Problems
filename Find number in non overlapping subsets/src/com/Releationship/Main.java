package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int find(int arr[], int val, int size) {
        for (int i = 0; i < arr.length; i += size) {
            boolean result = false;
            for (int j = i; j < i + size && j < arr.length; j++) {
                if (arr[j] == val) {
                    result = true;
                    break;
                }
            }
            if (result == false) {
                return 0;
            }
            result = false;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int num = scanner.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to be searched :- ");
        int val = scanner.nextInt();
        System.out.print("Enter the size of subsets :- ");
        int size = scanner.nextInt();

        System.out.println(find(arr, val, size));;
    }
}
