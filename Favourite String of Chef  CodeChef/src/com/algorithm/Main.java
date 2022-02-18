package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            int i = 0;
            while (i < n) {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'd' && str.charAt(i + 3) == 'e') {
                        System.out.println("AC");
                        break;
                    }
                    else if (str.charAt(i + 1) == 'h' && str.charAt(i + 2) == 'e' && str.charAt(i + 3) == 'f') {
                        System.out.println("WA");
                        break;
                    }
                    else {
                        i++;
                    }
                }
                else {
                    i++;
                }
            }
        }
    }
}
