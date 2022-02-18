package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int p = scanner.nextInt();
            int s = scanner.nextInt();
            double h = (p - Math.sqrt(p * p - 24 * s)) / 12;
            double volume = (h * h * h) - ((p * h * h)/ 4) + ((s * h) / 2);
            System.out.printf("%.2f\n", volume);
        }
    }
}
