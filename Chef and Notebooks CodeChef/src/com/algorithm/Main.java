package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            boolean flag = false;

            while (n-- > 0) {
                int p = scanner.nextInt();
                int c = scanner.nextInt();

                if ((y + p) >= x && c <= k) {
                    flag = true;
                }

            }

            if (flag) {
                System.out.println("LuckyChef");
            }
            else {
                System.out.println("UnluckyChef");
            }
        }
    }
}
