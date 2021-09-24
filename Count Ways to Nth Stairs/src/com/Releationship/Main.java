package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int countWays(int n) {
        if(n <= 1) {
            return n;
        }
        return countWays(n-1) + countWays(n-2);
    }

    public static int countWays(int n, int m) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++) {
                res[i] += res[i - j];
            }
        }
        return res[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        System.out.println("The total number of ways is :- " + countWays(n+1));
    }
}

