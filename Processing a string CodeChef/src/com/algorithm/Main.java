package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }

            System.out.println(sum);
        }
    }
}
