package com.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void reverseWords(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
            }
            else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        reverseWords(str);
    }
}
