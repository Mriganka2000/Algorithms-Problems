package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int val = 27 - (c - 96);
            char newChar = (char)(val + 96);
            result += newChar;
        }
        System.out.println(result);
    }
}
