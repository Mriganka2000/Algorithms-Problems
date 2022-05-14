package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void printAlphabets(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int val = map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), val + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                sb.append(key);
                sb.append(map.get(key));
            }
        }

        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printAlphabets(str);
    }
}
