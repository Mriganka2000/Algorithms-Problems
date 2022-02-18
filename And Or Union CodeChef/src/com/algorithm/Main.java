package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int ans = 0, pow = 1;

            for (int j = 0; j < 32; j++) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 1) {
                        count++;
                    }
                    arr[i] /= 2;
                }
                if (count > 1) {
                    ans = ans + pow;
                }
                pow *= 2;
            }

            System.out.println(ans);
        }
    }
}
