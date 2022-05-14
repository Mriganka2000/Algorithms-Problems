package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        long mod = 1000000007;
        while (n-- != 0) {
            long val = scanner.nextInt();
            sum += val;
            sum = ((sum % mod) + mod) % mod;
        }
        long q = scanner.nextInt();
        while (q-- != 0) {
            long val = scanner.nextInt();
            sum += sum;
            sum = ((sum % mod) + mod) % mod;
            System.out.println(sum + val - val);
        }
    }
}
