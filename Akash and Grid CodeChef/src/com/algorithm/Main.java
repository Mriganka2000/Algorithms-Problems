package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();

            if ((m + x) % 2 == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }
    }
}
