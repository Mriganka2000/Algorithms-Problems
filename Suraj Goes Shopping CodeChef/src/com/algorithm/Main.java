package com.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr, Collections.reverseOrder());

            int pay = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((i + 1) % 4 == 1 || (i + 1) % 4 == 2) {
                    pay += arr[i];
                }
            }

            System.out.println(pay);
        }
    }
}
