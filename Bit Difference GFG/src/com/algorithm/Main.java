package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int countBitsFlip(int n1, int n2) {
        int val = n1 ^ n2;

        int countSetBits = 0;

        while (val != 0) {
            countSetBits++;
            val &= (val - 1);
        }

        return countSetBits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(countBitsFlip(n1, n2));
    }
}
