package com.Algorithm;

import java.util.Scanner;

public class Main {
    private static final String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X","IX", "V", "IV", "I"};
    private static final int[] value = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num - value[i] >= 0) {
                sb.append(roman[i]);
                num = num - value[i];
            }
            else {
                i++;
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to convert :- ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The roman value is :- " + intToRoman(num));
    }
}
