package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int count = 0;

            for (int i = start; i <= end; i++) {
                int rem = i % 10;
                if (rem == 2 || rem == 3 || rem == 9) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
