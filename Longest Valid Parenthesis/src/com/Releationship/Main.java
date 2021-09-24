package com.Releationship;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int longestValidParentheses(String str) {
        int max = 0;
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                s.push(i);
            }
            else {
                s.pop();
                if(s.empty()) {
                    s.push(i);
                }
                else {
                    max = Math.max(max, i-s.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression only with '(' and ')' :- ");
        String str = sc.next();
        System.out.println("Longest valid expression is :- " + longestValidParentheses(str));;
    }
}
