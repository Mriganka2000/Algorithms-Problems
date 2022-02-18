package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextInt();
            long answer = 0;
            if (n == 3) {
                System.out.println(10);
            }
            else if (n > 3) {
                answer = (long) Math.pow(3, (n - 3)) * 8 * (n - 2);
                answer = answer + answer / 4;
                System.out.println(answer);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
