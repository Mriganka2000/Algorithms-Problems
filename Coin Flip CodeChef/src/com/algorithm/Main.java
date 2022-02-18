package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int g = scanner.nextInt();
            while (g-- > 0) {
                int i = scanner.nextInt();
                int n = scanner.nextInt();
                int q = scanner.nextInt();

                if (n % 2 == 0) {
                    System.out.println(n / 2);
                }
                else {
                    if (q == i) {
                        System.out.println(n / 2);
                    }
                    else {
                        System.out.println((n / 2) + 1);
                    }
                }
            }
        }
    }
}
