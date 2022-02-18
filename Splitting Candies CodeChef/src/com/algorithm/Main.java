package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();

            if (k <= 0 || n < k) {
                System.out.println("0 " + n);
            }
            else {
                System.out.println(n / k + " " + n % k);
            }
        }
    }
}
