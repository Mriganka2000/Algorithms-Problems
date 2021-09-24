package com.Releationship;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean checkWordBreak(String str, List<String> wordDict) {
        boolean [] table = new boolean[str.length() + 1];
        table[0] = true;
        HashSet<String> hashSet = new HashSet<>();

        for (String item : wordDict) {
            hashSet.add(item);
        }

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (table[j] && hashSet.contains(str.substring(j, i))) {
                    table[i] = true;
                    break;
                }
            }
        }

        return table[str.length()];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<String> wordDict = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            wordDict.add(scanner.next());
        }
        System.out.println("The word status :- " + checkWordBreak(str, wordDict));
    }
}
