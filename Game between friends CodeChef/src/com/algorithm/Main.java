package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a >= b) {
                b += c;
            }
            else {
                a += c;
            }
            if (a >= b) {
                b += d;
            }
            else {
                a += d;
            }
            if (a >= b) {
                System.out.println("N");
            }
            else {
                System.out.println("S");
            }
        }
    }
}
