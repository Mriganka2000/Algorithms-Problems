package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            int val = arr[k - 1];

            Arrays.sort(arr);

            int pos = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == val) {
                    pos = i;
                }
            }

            System.out.println(pos + 1);

            t--;
        }
    }
}
