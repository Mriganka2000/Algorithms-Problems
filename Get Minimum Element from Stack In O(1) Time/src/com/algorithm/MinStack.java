package com.algorithm;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> support;

    public MinStack() {
        this.stack = new Stack<>();
        this.support = new Stack<>();
    }

    public void push(int data) {
        if (stack.isEmpty() && support.isEmpty()) {
            stack.push(data);
            support.push(data);
        }
        else if (support.peek() > data) {
            stack.push(data);
            support.push(data);
        }
        else {
            stack.push(data);
        }
    }

    public int pop() {
        int val = 0;
        if (stack.isEmpty()) {
            throw new RuntimeException();
        }
        else if (stack.peek().equals(support.peek())) {
            val = stack.pop();
            support.pop();
        }
        else {
            val = stack.pop();
        }
        return val;
    }

    public int getMin() {
        return support.peek();
    }
}
