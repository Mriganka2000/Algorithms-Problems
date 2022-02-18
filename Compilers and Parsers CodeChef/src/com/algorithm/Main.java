package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            int count = 0;
            int ans = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '<') {
                    count++;
                }
                else {
                    count--;
                    if (count == 0) {
                        ans = Math.max(ans, i + 1);
                    }
                    else if (count < 0) {
                        break;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
