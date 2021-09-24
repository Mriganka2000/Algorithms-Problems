package com.Releationship;

import java.util.Stack;

public class Main {

    public static void findCelebrity(int arr[][]) {
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

        int possible = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != possible) {
                if (arr[possible][i] == 1 || arr[i][possible] == 0) {
                    System.out.println("No celebrity");
                    return;
                }
            }
        }
        System.out.println("The celebrity is = " + possible);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{0,0,0},{1,1,1}};
        findCelebrity(arr);
    }
}