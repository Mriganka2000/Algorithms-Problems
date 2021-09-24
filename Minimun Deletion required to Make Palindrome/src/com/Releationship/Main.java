package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int lps(String str, int i, int j) {
        if(i >= j) {
            return 0;
        }
        if(str.charAt(i) == str.charAt(j)) {
            return lps(str, i+1, j-1);
        }
        return 1 + Math.min(lps(str, i+1, j), lps(str, i, j-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.next();
        int n = str.length();
        System.out.println("The minimum removal needed is :- " + lps(str, 0, n-1));
    }
}

