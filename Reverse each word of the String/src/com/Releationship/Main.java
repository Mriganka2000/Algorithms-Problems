package com.Releationship;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static String reverseEachWord(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                stack.push(arr[i]);
            }
            else {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text :- ");
        String str = sc.nextLine();
        System.out.println(reverseEachWord(str));
    }
}