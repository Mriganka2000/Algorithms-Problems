package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String given = scanner.next();
        String original = "abcdefghijklmnopqrstuvwxyz";

        while (t-- > 0) {
            HashMap<Character, Character> map = new HashMap<>();
            String str = scanner.next();

            for (int i = 0; i < given.length(); i++) {
                map.put(original.charAt(i), given.charAt(i));
                map.put(original.toUpperCase().charAt(i), given.toUpperCase().charAt(i));
            }
            map.put('_', ' ');

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    sb.append(map.get(str.charAt(i)));
                }
                else {
                    sb.append(str.charAt(i));
                }
            }

            System.out.println(sb.toString());
        }
    }
}
