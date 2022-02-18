package com.algorithm;

import java.util.Stack;

public class Queue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(val);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void dequeue() {
        if (stack1.isEmpty()) {
            throw new NullPointerException();
        }
        else {
            stack1.pop();
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int front() {
        return stack1.peek();
    }
}
