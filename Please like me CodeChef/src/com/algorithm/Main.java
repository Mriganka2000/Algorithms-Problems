package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long l = scanner.nextLong();
            long d = scanner.nextLong();
            long s = scanner.nextLong();
            long c = scanner.nextLong();
            long likes = s;
            long temp = s;
            boolean flag = false;

            for (int i = 2; i <= d; i++) {
                likes =  temp + temp * c;
                if (likes >= l) {
                    flag = true;
                    break;
                }
                else {
                    temp = likes;
                }
            }

            if ((likes >= l) || flag) {
                System.out.println("ALIVE AND KICKING");
            }
            else {
                System.out.println("DEAD AND ROTTING");
            }
        }
    }
}
