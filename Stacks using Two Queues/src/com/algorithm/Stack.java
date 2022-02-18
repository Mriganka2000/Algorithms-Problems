package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public void push(int val) {
        queue2.add(val);

        while(!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.remove();
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public void pop() {
        if (queue1.isEmpty()) {
            throw new NullPointerException();
        }
        else {
            int val = queue1.peek();
            queue1.remove();
        }
    }

    public int peek() {
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
