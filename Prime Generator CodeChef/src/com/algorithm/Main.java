package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        int check = (int) Math.sqrt(num);
        for (int i = 2; i <= check; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int start = scanner.nextInt();
            int end  = scanner.nextInt();

            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
