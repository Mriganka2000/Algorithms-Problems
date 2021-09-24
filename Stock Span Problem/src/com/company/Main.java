package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int[] stockSpan(int arr[]) {
        int result[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[i] += result[stack.peek()];
                stack.pop();
            }
            stack.push(i);
            result[i] += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter he elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result[] = stockSpan(arr);
        System.out.println("Stock span is :- ");
        for (int item : result) {
            System.out.println(item);
        }
    }
}
