package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n % 6 == 0 || n % 6 == 1 || n % 6 == 3) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}