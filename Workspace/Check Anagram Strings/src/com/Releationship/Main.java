package com.Releationship;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            hashMap.put(str1.charAt(i), 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (hashMap.get(str2.charAt(i)) == null) {
                return false;
            }
            hashMap.put(str2.charAt(i), hashMap.get(str2.charAt(i)) - 1);
        }
        for (char item : hashMap.keySet()) {
            if (hashMap.get(item) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    String str1 = scanner.next();
	    String str2 = scanner.next();
        System.out.println(isAnagram(str1.toLowerCase(), str2.toLowerCase()));
    }
}
