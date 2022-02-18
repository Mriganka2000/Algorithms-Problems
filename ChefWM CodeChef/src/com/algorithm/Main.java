package com.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            long ans = 0, temp = m;

            for (long i = 2; i * i <= m; i++) {
                if (!(temp % i == 0)) {
                    ans++;
                    while (!(temp % i == 0)) {
                        temp /= i;
                    }
                }
            }
            
            if (temp > 1) {
                ans++;
            }

            ArrayList<Long> arr = new ArrayList<>();
            for (long i = 1; i * i <= n; i++) {
                if (!(n % i == 0)) {
                    arr.add(i);
                    if (i != (n / i)) {
                        arr.add(n / i);
                    }
                }
            }

            long val = 0;

            for (long item : arr) {
                if (item <= ans) {
                    val = item;
                }
            }

            System.out.println(val);
        }
    }
}
