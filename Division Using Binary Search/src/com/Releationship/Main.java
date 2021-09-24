package com.Releationship;

import java.util.Scanner;

public class Main {

    public static double divide(double x, double y) {
        if (y == 0) {
            return Double.MAX_VALUE;
        }

        double left = 0.00, right = Double.MAX_VALUE;

        double precision = 0.001;

        int sign = 1;

        if (x * y < 0) {
            sign = -1;
        }

        x = Math.abs(x);
        y = Math.abs(y);

        while (true) {
            double mid = (left + right) / 2;

            if (Math.abs(y * mid - x) <= precision) {
                return mid*sign;
            }

            if(mid * y < x) {
                left = mid;
            }

            else right = mid;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the 1st number :- ");
        int x = s.nextInt();
        System.out.print("Enter the 2nd number :- ");
        int y = s.nextInt();

        System.out.println("The division result is :- " + divide(x, y));
    }
}
