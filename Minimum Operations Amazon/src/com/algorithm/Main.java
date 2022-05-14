package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static int longestNonDecreasingSubsequence(Vector<Integer> vector) {
        int[] list = new int[vector.size()];

        Arrays.fill(list, 1);

        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (vector.get(i) >= vector.get(j) && list[i] < list[j] + 1) {
                    list[i] = list[j] + 1;
                }
            }
        }

        int max = list[0];
        for (int j : list) {
            max = j;
        }

        return max;
    }

    public static int minOperations(int[] arr, int k) {
        int result = 0;

        for (int i = 0; i < k; i++) {
            Vector<Integer> vector = new Vector<>();
            for (int j = i; j < arr.length; j += k) {
                vector.add(arr[j]);
            }
            int operation = vector.size() - longestNonDecreasingSubsequence(vector);
            result += operation;
        }
        return result;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        System.out.println(minOperations(arr, k));
    }
}
