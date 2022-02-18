package com.Releationship;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                else if (str.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if (str.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if (str.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isBalanced(str));
    }
}
