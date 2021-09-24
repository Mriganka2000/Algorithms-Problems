package com.Algorithm;

public class Main {

    public boolean regexMatch(String text, String pattern) {
        boolean T[][] = new boolean[text.length()+1][pattern.length()+1];
        char textArray[] = text.toCharArray();
        char patternArray[] = pattern.toCharArray();

        T[0][0] = true;

        for (int i = 1; i < T[0].length; i++) {
            if (patternArray[i-1] == '*') {
                T[0][i] = T[0][i - 2];
            }
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (textArray[i-1] == patternArray[j-1] || patternArray[j-1] == '.') {
                    T[i][j] = T[i-1][j-1];
                }
                else if (patternArray[j-1] == '*') {
                    T[i][j] = T[i][j-2];
                    if (textArray[i-1] == patternArray[j-2] || patternArray[j-2] == '.') {
                        T[i][j] = T[i][j] | T[i-1][j];
                    }
                }
                else {
                    T[i][j] = false;
                }
            }
        }
        return T[textArray.length][patternArray.length];
    }

    public static void main(String[] args) {
        Main rm = new Main();
        System.out.println(rm.regexMatch("Tushar","Tushar"));
        System.out.println(rm.regexMatch("Tusha","Tushar*a*b*"));
        System.out.println(rm.regexMatch("","a*b*"));
        System.out.println(rm.regexMatch("abbbbccc","a*ab*bbbbc*"));
        System.out.println(rm.regexMatch("abbbbccc","aa*bbb*bbbc*"));
        System.out.println(rm.regexMatch("abbbbccc",".*bcc"));
        System.out.println(rm.regexMatch("abbbbccc",".*bcc*"));
        System.out.println(rm.regexMatch("abbbbccc",".*bcc*"));
        System.out.println(rm.regexMatch("aaa","ab*a*c*a"));
        System.out.println(rm.regexMatch("aa", "a*"));
    }
}
