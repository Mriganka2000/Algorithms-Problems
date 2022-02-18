package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        long count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        long div = n / s.length();
        long rem = n % s.length();
        long remCount = 0;
        for(int i = 0; i < rem; i++) {
            if(s.charAt(i) == 'a') {
                remCount++;
            }
        }
        long result = count * div + remCount;
        System.out.println(result);
    }
}
