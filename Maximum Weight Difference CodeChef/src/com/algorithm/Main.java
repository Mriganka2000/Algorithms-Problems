package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if(k>n/2) {
                k = n-k;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            long child = 0;
            long chef = 0;

            for (int i = 0; i < k; i++) {
                child += arr[i];
            }
            for (int i = k; i < n; i++) {
                chef += arr[i];
            }

            System.out.println((chef - child));
        }
    }
}

