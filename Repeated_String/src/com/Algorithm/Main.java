package com.Algorithm;

import java.util.Scanner;

public class Main {
    public static long repeatedString(String s, long n) {
        long times = n / s.length();
        long rem = n % s.length();

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }

        char str[] = s.toCharArray();
        int count2 = 0;

        for(int i = 0; i < rem; i++) {
            if(str[i] == 'a') {
                count2 ++;
            }
        }

        long result = (times*count) + count2;

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = s.next();
        System.out.print("Enter the generated string length :- ");
        long n = s.nextLong();
        System.out.println("The result is :- " + repeatedString(str, n));
    }
}
