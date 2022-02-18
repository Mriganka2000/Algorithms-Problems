package com.algorithm;

import java.util.Stack;

class Solution {

    private int i = 0;

    public String decodeStringRecursive(String str) {
        StringBuilder result = new StringBuilder();

        while (i < str.length() && str.charAt(i) != ']') {
            if (Character.isDigit(str.charAt(i))) {
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + str.charAt(i++) - '0';
                }
                i++;
                String r = decodeStringRecursive(str);
                while (num-- > 0) {
                    result.append(r);
                }
                i++;
            }
            else {
                result.append(str.charAt(i++));
            }
        }

        return result.toString();
    }
}

public class Main {

    public static String decodeString(String str) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num = str.charAt(i) - '0';
                while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    num = num * 10 + str.charAt(i + 1) - '0';
                    i++;
                }
                numStack.add(num);
            }
            else if (str.charAt(i) == '[') {
                stringStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if (str.charAt(i) == ']') {
                int repeat = numStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int j = 0; j < repeat; j++) {
                    temp.append(sb);
                }
                sb = temp;
            }
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "3[a]2[bc]";
        String str2 = "3[a2[c]]";
        System.out.println(decodeString(str1));
        System.out.println(decodeString(str2));
        System.out.println((new Solution()).decodeStringRecursive(str1));
        System.out.println((new Solution()).decodeStringRecursive(str2));
    }
}
