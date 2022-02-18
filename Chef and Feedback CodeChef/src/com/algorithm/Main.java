package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            boolean flag = false;

            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == '0') {
                    if (str.charAt(i + 1) == '1' && str.charAt(i + 2) == '0') {
                        flag = true;
                    }
                }
                else {
                    if (str.charAt(i + 1) == '0' && str.charAt(i + 2) == '1') {
                        flag = true;
                    }
                }
            }

            if (flag) {
                System.out.println("Good");
            }
            else {
                System.out.println("Bad");
            }
        }
    }
}
