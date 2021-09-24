package com.Releationship;

public class Main {

    public static boolean check(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        int[] map = new int[128];

        for (int i = 0; i < word.length(); i++) {
            if (map[(int) pattern.charAt(i)] == 0) {
                map[(int) pattern.charAt(i)] = word.charAt(i);
            }
            else if (map[(int) pattern.charAt(i)] != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void matchSpecificPattern(String words[], String pattern) {
        for (String word : words) {
            if(check(word, pattern)) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"abb", "abc", "xyz", "xyy"};
        String pattern = "foo";

        System.out.println("Matched words are :- ");
        matchSpecificPattern(words, pattern);
    }
}
