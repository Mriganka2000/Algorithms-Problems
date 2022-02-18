package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void groupAnagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String item : arr) {
            char[] str = item.toCharArray();
            Arrays.sort(str);
            String word = new String(str);
            if (map.containsKey(word)) {
                map.get(word).add(item);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(item);
                map.put(word, list);
            }
        }

        for (String item : map.keySet()) {
            System.out.println(map.get(item));
        }
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String[] arr = { "cat", "dog", "tac", "god", "act" };
        groupAnagrams(arr);
    }
}
