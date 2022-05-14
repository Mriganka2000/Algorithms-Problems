package com.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static Set<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int item : arr1) {
            set.add(item);
        }

        for (int item : arr2) {
            if (set.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array :- ");
        int m = scanner.nextInt();
        System.out.print("Enter the size of the 2nd array :- ");
        int n = scanner.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        System.out.println("Enter the 1st array :- ");
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the 2nd array :- ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println(intersection(arr1, arr2));
    }
}
