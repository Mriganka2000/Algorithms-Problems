package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long z = scanner.nextLong();
            long y = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long remain = z - y;
            long sum = a + b + c;

            if (remain >= sum) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
