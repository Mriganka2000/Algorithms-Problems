package com.Releationship;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LinkedHashMap<Character, Integer> hashmap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if(hashmap.containsKey(str.charAt(i))) {
                int val = hashmap.get(str.charAt(i));
                val++;
                hashmap.replace(str.charAt(i), val);
            }
            else {
                hashmap.put(str.charAt(i), 1);
            }
        }

        for(Map.Entry m : hashmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        StringBuilder sb = new StringBuilder();
        char[] arr = new char[hashmap.size()];
        int i = 0;
        for (char item : hashmap.keySet()) {
            arr[i++] = item;
        }
        for (int j = 0; j < arr.length / 2; j++) {
            char temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }

        for (char item : arr) {
            sb.append(item);
        }
        System.out.println(sb.toString());
    }
}