package com.algorithm;

public class Main {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.push(2);
        stack.push(1);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
    }
}
