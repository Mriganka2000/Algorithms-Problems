package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int i = 0, sqrt = 1;
        while (sqrt <= n) {
            i++;
            sqrt = i * i;
        }

        return i-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        System.out.println("The floor Sqrt is :- " + floorSqrt(n));
    }
}
