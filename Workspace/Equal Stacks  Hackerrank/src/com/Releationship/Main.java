package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void fillStacks(Stack<Integer> st1, List<Integer> h1, Stack<Integer> st2, List<Integer> h2, Stack<Integer> st3, List<Integer> h3) {
        int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;

        for (int i = h1.size() - 1; i >= 0; i--) {
            st1TotalHeight += h1.get(i);
            st1.push(st1TotalHeight);
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            st2TotalHeight += h2.get(i);
            st2.push(st2TotalHeight);
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            st3TotalHeight += h3.get(i);
            st3.push(st3TotalHeight);
        }
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int maxHeight = 0;

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        fillStacks(st1, h1, st2, h2, st3, h3);

        while (!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()) {
            int stack1Height = st1.peek();
            int stack2Height = st2.peek();
            int stack3Height = st3.peek();

            if (stack1Height == stack2Height && stack2Height == stack3Height) {
                maxHeight = st1.peek();
                break;
            }

            if (stack1Height >= stack2Height && stack1Height >= stack3Height) {
                st1.pop();
            } else if (stack2Height >= stack1Height && stack2Height >= stack3Height) {
                st2.pop();
            } else if (stack3Height >= stack1Height && stack3Height >= stack2Height) {
                st3.pop();
            }
        }

        return maxHeight;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            h1.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            h2.add(scanner.nextInt());
        }
        for (int i = 0; i < p; i++) {
            h3.add(scanner.nextInt());
        }
        System.out.println(equalStacks(h1, h2, h3));
    }
}
