package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static boolean check(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count == 3;
    }

    public static int findMagicNumber(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(findMagicNumber(arr, k));
    }
}
