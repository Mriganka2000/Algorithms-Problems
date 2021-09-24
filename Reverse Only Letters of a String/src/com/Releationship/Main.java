package com.Releationship;

import java.util.Stack;
import java.util.Scanner;

public class Main
{
    public static String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                sb.append(st.pop());
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String s = sc.next();
        System.out.println("The Reverse is :- " + reverseOnlyLetters(s));
    }
}
