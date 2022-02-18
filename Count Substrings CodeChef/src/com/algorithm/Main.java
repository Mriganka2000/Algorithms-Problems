package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    count++;
                }
            }Carvans
                    count = count * (count + 1) / 2;

            System.out.println(count);
        }
    }
}
