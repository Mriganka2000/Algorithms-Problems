package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static long arrayManipulationModified(int n, List<List<Integer>> queries) {
        long[] arr = new long[n+2];

        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            int val = query.get(2);
            arr[start] += val;
            arr[end + 1] -= val;
        }

        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];

        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            int val = query.get(2);
            for (int i = start-1; i < end; i++) {
                arr[i] += val;
            }
        }

        long max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                temp.add(scanner.nextInt());
            }
            list.add(temp);
        }
        System.out.println(arrayManipulationModified(n, list));
    }
}
