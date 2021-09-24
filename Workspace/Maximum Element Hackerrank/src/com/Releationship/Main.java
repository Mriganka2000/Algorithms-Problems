package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for (String operation : operations) {
            String[] arr = operation.split(" ");
            int val = 0, op = 0;
            if (arr.length == 2) {
                op = Integer.parseInt(arr[0]);
                val = Integer.parseInt(arr[1]);
            }
            else {
                op = Integer.parseInt(arr[0]);
            }
            switch (op) {
                case 1:
                    if (val > maxStack.peek()) {
                        maxStack.push(val);
                    }
                    else {
                        maxStack.push(maxStack.peek());
                    }
                    break;
                case 2:
                    maxStack.pop();
                    break;
                case 3:
                    list.add(maxStack.peek());
                    break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> operations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            operations.add(scanner.nextLine());
        }
        System.out.println(getMax(operations));
    }
}
