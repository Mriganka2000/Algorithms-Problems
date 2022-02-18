package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            if (360 % n == 0) {
                System.out.print("y ");
            }
            else {
                System.out.print("n ");
            }
            if (n <= 360) {
                System.out.print("y ");
            }
            else {
                System.out.print("n ");
            }
            if (n <= 26) {
                System.out.print("y");
            }
            else {
                System.out.print("n");
            }
            System.out.println();
        }
    }
}
