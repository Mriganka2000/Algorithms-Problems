package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int val = (int) str.charAt(i);
            val = val + 3;

            if (val > 122) {
                val = val - 122;
                val = 96 + val;
                result += (char) val;
            }
            else {
                result += (char) val;
            }
        }

        System.out.println(result);
    }
}
