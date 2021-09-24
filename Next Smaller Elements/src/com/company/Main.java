package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static List<Integer> nextSmaller(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) >= list.get(i)) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            }
            else {
                result.add(list.get(stack.peek()));
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println(nextSmaller(arr));
    }
}
