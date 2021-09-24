package com.Releationship;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int[] findNextGreater(int arr[]) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int n = 0;

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() < arr[i]) {
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                    result[stack.peek()] = arr[i];
                    stack.pop();
                }
                stack.push(i);
            }
            else {
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            result[stack.peek()] = -1;
            stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = findNextGreater(arr);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
