package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int ans = 0;

        while (t-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();

            int a=(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int b=(x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
            int c=(x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);

            if (a + b == c || b + c == a || c + a == b) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
