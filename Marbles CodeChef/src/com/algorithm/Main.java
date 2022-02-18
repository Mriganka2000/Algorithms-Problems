package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            n--;
            k--;

            k = Math.min(k, n - k);
            
            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans = ans * n;
                ans = ans / (i + 1);
                n--;
            }

            System.out.println(ans);
        }
    }
}
