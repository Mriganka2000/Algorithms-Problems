package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static boolean checkPangram(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), 0);
        }

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                if (map.containsKey(str.charAt(i))) {
                    int val = map.get(str.charAt(i));
                    val++;
                    map.put(str.charAt(i), val);
                }
            }
        }

        for (char item : map.keySet()) {
            if (map.get(item) < 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(checkPangram(str));
    }
}
