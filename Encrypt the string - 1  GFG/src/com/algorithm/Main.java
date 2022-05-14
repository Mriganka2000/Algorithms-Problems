package com.algorithm;

import java.util.Scanner;

public class Main {

    public static String encryptString(String str) {
        int x = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i < str.length();i++) {
            x++;
            if (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                continue;
            }
            ans.append(str.charAt(i));
            ans.append(Integer.toString(x));
            x = 0;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(encryptString(str));
    }
}
