package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            char[] arr = str.toCharArray();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    if ((i - 1) >= 0) {
                        arr[i - 1] = 'x';
                    }
                    if ((i + 1) <= (n - 1)) {
                        arr[i + 1] = 'x';
                    }
                }
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '0') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
