package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        if (r >= 20 && r <= 30) {
            double pi = 3.1415;
            double result = pi * r * r;
            result = result * 1000;
            int val = (int)result;
            double ans = (double)val / 1000;
            System.out.println(ans);
        } else {
            System.out.println("Wrong input");
        }
    }
}

