package com.company;

import java.util.Scanner;

public class Main {

    public static String encode(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            int k = val;
            if (val + k > 122) {
                k -= (122 - val);
                k = k % 26;
                res += (char)(96 + k);
            }
            else {
                res += (char)(val + k);
            }
        }
        return res;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(encode(str));
    }
}
