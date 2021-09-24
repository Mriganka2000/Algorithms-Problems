package com.Releationship;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t >= 1) {
            LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    int val = hashMap.get(str.charAt(i));
                    val = val + 1;
                    hashMap.put(str.charAt(i), val);
                }
                else {
                    hashMap.put(str.charAt(i), 1);
                }
            }
            int single = 0, couple = 0;
            for (char item : hashMap.keySet()) {
                if (hashMap.get(item) == 1) {
                    single++;
                }
                else if (hashMap.get(item) % 2 == 0) {
                    couple = couple + hashMap.get(item) / 2;
                }
                else if (hashMap.get(item) % 2 != 0) {
                    int val = hashMap.get(item) - 3;
                    couple = couple + val / 2;
                }
            }
            if (single <= couple) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
