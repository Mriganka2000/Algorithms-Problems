package com.Releationship;

import java.util.Stack;

public class Queue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int data) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int deQueue() {
        if (stack1.isEmpty()) {
            throw new NullPointerException();
        }
        else {
            return stack1.pop();
        }
    }

    public void push(int data) {
        stack1.push(data);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int y = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return y;
    }

    public int top() {
        if (stack1.isEmpty()) {
            throw new NullPointerException();
        }
        else {
            return stack1.peek();
        }
    }
}
