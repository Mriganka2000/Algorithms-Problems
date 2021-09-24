package com.Releationship;

import java.util.*;

public class Main {

    public static List<String> list = new ArrayList<>();

    public static int getMinRemoval(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                continue;
            }
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            else {
                if (stack.size() == 0) {
                    stack.push(str.charAt(i));
                }
                else if (stack.peek() == '(') {
                    stack.pop();
                }
                else if (stack.peek() == ')') {
                    stack.push(str.charAt(i));
                }
            }
        }

        return stack.size();
    }

    public static void solution(String str, int min, HashSet<String> ans) {
        if (min == 0) {
            int minNow = getMinRemoval(str);
            if(minNow == 0) {
                if(!ans.contains(str)) {
                    list.add(str);
                    ans.add(str);
                }
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                continue;
            }
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            solution(left + right, min-1, ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sequence :- ");
        String str = sc.next();
        int min = getMinRemoval(str);
        solution(str, min, new HashSet<>());
        for (String item : list) {
            System.out.println(item);
        }
    }
}
