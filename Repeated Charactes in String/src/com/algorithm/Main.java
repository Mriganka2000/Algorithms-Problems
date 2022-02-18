package com.algorithm;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    String str = "india";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (Character item : map.keySet()) {
            System.out.println(item + " " + map.get(item));
        }
    }
}
