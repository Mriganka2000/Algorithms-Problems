package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a % 2 != 0  && b % 2 != 0) {
                System.out.println((a / 2 + 1) * (b / 2 + 1));
            }
            else if (a % 2 == 0  && b % 2 != 0) {
                System.out.println((a / 2) * (b / 2 + 1));
            }
            else if (a % 2 != 0  && b % 2 == 0) {
                System.out.println((a / 2 + 1) * (b / 2));
            }
            else {
                System.out.println((a / 2) * (b / 2));
            }
        }
    }
}
