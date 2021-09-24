package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void superAsciiChecker(String str) {
        int[] ascii = new int[27];
        int[] hash = new int[27];

        for (int i = 1; i < 27; i++) {
            ascii[i] = i;
        }

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 96] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (ascii[str.charAt(i) - 96] != hash[str.charAt(i) - 96]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.next();
        superAsciiChecker(str);
    }
}