package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String str = scanner.next();
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '1') {
                    sum++;
                }
                arr[i] = sum;
            }

            int x = n - k;
            int[] ans = new int[k];
            int p = x + 1;

            ans[0] = arr[p - 1];
            for (int i = 1; i < k; i++) {
                ans[i] = arr[i + p - 1] - arr[i - 1];
            }
            
            int count = 0;
            for (int i = 0; i < k; i++) {
                if (ans[i] % 2 == 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
