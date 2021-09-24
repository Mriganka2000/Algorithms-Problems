package com.Releationship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void breakArray(int arr[], int sum) {
        List<Integer> list = new ArrayList<>();
        int sumA = 0;
        int n = arr.length - 1;

        while (n != 0) {
            list.add(arr[n]);
            sumA += arr[n];
            sum -= arr[n];
            if (sumA > sum) {
                break;
            }
            n--;
        }

        for (int item : list) {
            System.out.println(item);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        breakArray(arr, sum);
    }
}
