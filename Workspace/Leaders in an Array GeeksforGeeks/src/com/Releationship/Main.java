package com.Releationship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static ArrayList<Integer> leaders(int arr[], int n){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }

        Collections.reverse(arrayList);

        return arrayList;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(leaders(arr, n));
    }
}
