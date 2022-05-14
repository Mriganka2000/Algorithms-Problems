package com.algorithm;

import java.util.*;

public class Main {
    public static String reverseWords(String str) {
        String temp = "";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                list.add(temp);
                temp = "";
            }
            else {
                temp += str.charAt(i);
            }
        }

        list.add(temp);

        Collections.reverse(list);

        String result = "";

        for (String item : list) {
            result += item;
            result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("We love Java"));
        System.out.println(reverseWords("World Hello"));
        System.out.println(reverseWords("To be or not to be"));
        System.out.println(reverseWords("You are amazing"));
    }
}