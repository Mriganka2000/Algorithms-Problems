package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int count(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                table[i] += table[j] * table[i - j - 1];
            }
        }

        return table[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = scanner.nextInt();
        System.out.println("THe number of BST possible are :- " + count(n));
    }
}
