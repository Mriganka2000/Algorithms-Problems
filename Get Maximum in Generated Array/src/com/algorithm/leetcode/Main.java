package com.algorithm.leetcode;

import java.util.Scanner;

public class Main {

    public static int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int[] num = new int[n+1];
        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                num[i] = num[i / 2];
            }
            else {
                num[i] = num[i / 2] + num[i / 2 + 1];
            }
        }

        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getMaximumGenerated(n));
    }
}
