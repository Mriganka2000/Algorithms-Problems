package com.algorithm;

import java.util.Stack;

public class Main {

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }

        while (stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            if (arr[i][j] == 1) {
                stack.push(j);
            }
            else {
                stack.push(i);
            }
        }

        int celeb = stack.pop();

        for (int i = 0; i < arr.length; i++) {
            if (i != celeb) {
                if (arr[i][celeb] == 0 || arr[celeb][i] == 1) {
                    System.out.println("None");
                    return;
                }
            }
        }

        System.out.println(celeb);
    }

    public static void main(String[] args) {
        int[][] MATRIX = {
                { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 }
        };
        findCelebrity(MATRIX);
    }
}
