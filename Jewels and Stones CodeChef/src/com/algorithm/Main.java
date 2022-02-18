package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String jewel = scanner.next();
            String stone = scanner.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < jewel.length(); i++) {
                map.put(jewel.charAt(i), 1);
            }
            int count = 0;
            for (int i = 0; i < stone.length(); i++) {
                if (map.containsKey(stone.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
