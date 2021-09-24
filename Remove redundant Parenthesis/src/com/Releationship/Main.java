package com.Releationship;

import java.util.Scanner;

public class Main {

    public static boolean stringValid(String s) {
        int countOpenParths = 0;
        int countCloseParths = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countOpenParths++;
            } else if (s.charAt(i) == ')') {
                countCloseParths++;
            }
        }

        return countCloseParths == countOpenParths;
    }

    public static boolean isValid(String s) {
        if (s.indexOf('(') == 0) {
            int firstCloseParenthesisIndex = s.indexOf(')');

            if (firstCloseParenthesisIndex > 0) {
                for (int i = firstCloseParenthesisIndex + 1; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if (c != ')' && c != '(') {
                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }

    public static void removeRedundant(String str) {
        if(stringValid(str)) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                String sub = str.substring(i, (str.length()-i));
                boolean valid = isValid(sub);
                if(!valid) {
                    result = sub;
                    break;
                }
            }
            System.out.println(result);
        }
        else {
            System.out.println("Invalid string");
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         removeRedundant("((abc)(def))");
         removeRedundant("(abc09%(cbc))");
    }
}
