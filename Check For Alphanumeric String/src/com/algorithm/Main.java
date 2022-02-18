package com.algorithm;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean flagA = false;
        boolean flagN = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                flagN = true;
            }
            if (Character.isAlphabetic(str.charAt(i))) {
                flagA = true;
            }
        }

        if (flagA && flagN) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

