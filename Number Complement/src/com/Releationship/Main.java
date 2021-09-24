package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static int findComplement(int num) {
        int res = 0;
        if(num == 0) {
            return 1;
        }
        String val = "";
        while(num > 0) {
            if(num % 2 == 0) {
                val = '1' + val;
            }
            else {
                val = '0' + val;
            }
            num = num / 2;
        }
        for(int i = 0; i < val.length(); i++) {
            res = res*2 + val.charAt(i)-48;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = s.nextInt();
        System.out.println("The complement is :- " + findComplement(n));
    }
}

