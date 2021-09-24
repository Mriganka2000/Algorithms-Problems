package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int countFingers(int n) {
        int pos = n % 8;
        if (pos == 1) {
            return pos;
        }
        if (pos == 5) {
            return pos;
        }
        if (pos == 0 || pos == 2) {
            return 2;
        }
        if (pos == 3 || pos == 7) {
            return 3;
        }
        if (pos == 4 || pos == 6) {
            return 4;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :- ");
        int n = sc.nextInt();
        System.out.println("The position in finger is :- " + countFingers(n));
    }
}
