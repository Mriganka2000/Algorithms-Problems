package com.Releationship;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        HashMap<Character, Integer> hasMap = new HashMap();
        hasMap.put('H', 1);
        hasMap.put('O', 16);
        hasMap.put('C', 12);
        hasMap.put('S', 32);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                int val = hasMap.get(str.charAt(i - 1));
                int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                result = result + val * temp;
            }
        }

        if (Character.isAlphabetic(str.charAt(str.length()-1))) {
            int val = hasMap.get(str.charAt(str.length() - 1));
            result = result + val * 1;
        }

        System.out.println(result);
    }
}
