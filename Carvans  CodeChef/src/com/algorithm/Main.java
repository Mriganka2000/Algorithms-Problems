package com.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Stack<Integer> stack = new Stack<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            stack.push(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < stack.peek()) {
                    stack.push(arr[i]);
                }
            }
            System.out.println(stack.size());
        }
    }
}
