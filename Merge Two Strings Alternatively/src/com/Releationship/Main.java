package com.Releationship;

import java.util.Scanner;

public class Main {

    public static String mergeStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int m = 0, n = 0;
        boolean flag = true;

        while (m < str1.length() && n < str2.length()) {
            if (flag) {
                stringBuilder.append(str1.charAt(m));
                m++;
                flag = false;
            }
            else {
                stringBuilder.append(str2.charAt(n));
                n++;
                flag = true;
            }
        }

        while (m < str1.length()) {
            stringBuilder.append(str1.charAt(m));
            m++;
        }
        while (n < str2.length()) {
            stringBuilder.append(str2.charAt(n));
            n++;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st string :- ");
        String  str1 = scanner.next();
        System.out.print("Enter the 2nd string :- ");
        String str2 = scanner.next();
        System.out.println(mergeStrings(str1, str2));
    }
}
