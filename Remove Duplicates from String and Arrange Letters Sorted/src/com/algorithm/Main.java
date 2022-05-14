package com.algorithm;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static String removeDuplicates(String str) {
        TreeSet<Character> set = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        Iterator<Character> iterator = set.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(removeDuplicates(str));
    }
}
