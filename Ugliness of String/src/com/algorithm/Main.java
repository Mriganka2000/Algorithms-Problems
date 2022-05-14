package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int a, b, cash;
    public static char[] str;

    public static void swapBits() {
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '1') {
                temp = i;
                break;
            }
        }
        int i = str.length - 1;
        while (i > temp && cash >= a){
            if (str[i] == '0') {
                if (str[temp] == '0') {
                    temp++;
                }
                else {
                    char c = str[temp];
                    str[temp] = str[i];
                    str[i] = c;
                    cash -= a;
                    i--;
                }
            }
            else {
                i--;
            }
        }
    }

    public static void flipBits() {
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '1') {
                temp = i;
                break;
            }
        }
        while (temp < str.length && cash >= b) {
            if (str[temp] == '1') {
                str[temp] = '0';
                cash -= b;
                temp++;
            }
        }
    }

    public static void biToDec() {
        int sum = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            sum += Integer.parseInt(String.valueOf(str[i])) * (int)Math.pow(2, str.length - i - 1);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        cash = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        str = s.toCharArray();
        if (a < b) {
            swapBits();
            flipBits();
        }
        else {
            flipBits();
            swapBits();
        }
        biToDec();
    }
}
