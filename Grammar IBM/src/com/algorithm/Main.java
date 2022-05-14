package com.algorithm;

import java.util.Scanner;

public class Main {

    public static String checkGrammar(String str) {
        if (str.compareTo("{}") == 0) {
            return "Set";
        }
        else if (str.compareTo("{,}") == 0) {
            return "Set";
        }
        else if (str.compareTo("{,,}") == 0) {
            return "Not set";
        }
        else if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
            return "Set";
        }
        else {
            return "Not set";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(checkGrammar(str));
    }
}