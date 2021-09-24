package com.Releationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String item : note) {
            hashMap.put(item, hashMap.getOrDefault(item, 0) + 1);
        }

        for (String  item : magazine) {
            hashMap.put(item, hashMap.getOrDefault(item, 2) - 1);
        }

        for (String item : note) {
            if (hashMap.get(item) != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> magazine = new ArrayList<>();
        List<String> note = new ArrayList<>();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            magazine.add(scanner.next());
        }
        for (int i = 0; i < n; i++) {
            note.add(scanner.next());
        }
        checkMagazine(magazine, note);
    }
}
