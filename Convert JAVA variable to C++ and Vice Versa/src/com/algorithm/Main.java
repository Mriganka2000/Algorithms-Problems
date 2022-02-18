package com.algorithm;

import java.util.Scanner;

public class Main {

    public static String solve(String input1) {
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == '_') {
                flag = true;
            }
        }

        if (flag) {
            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) == '_') {
                    i++;
                    sb.append(Character.toUpperCase(input1.charAt(i)));
                }
                else {
                    sb.append(input1.charAt(i));
                }
            }
        }
        else {
            for (int i = 0; i < input1.length(); i++) {
                if (Character.isUpperCase(input1.charAt(i))) {
                    sb.append("_");
                    sb.append(Character.toLowerCase(input1.charAt(i)));
                }
                else {
                    sb.append(input1.charAt(i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));
    }
}
