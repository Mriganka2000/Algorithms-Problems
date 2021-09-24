package com.Releationship;

import java.util.Stack;

public class _Stack {
    public Stack<Integer> stack;
    public int minElement;
    public int calculateElement;

    public _Stack() {
        this.stack = new Stack<>();
    }

    public void _push(int data) {
        if(stack.isEmpty()) {
            minElement = data;
            stack.push(data);
        }

        else {
            if (data < minElement) {
                calculateElement = 2 * data - minElement;
                minElement = data;
                stack.push(calculateElement);
            }
            else {
                stack.push(data);
            }
        }
    }

    public int _pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        int val = stack.pop();
        if (val < minElement) {
            minElement = 2 * minElement - val;
        }
        return val;
    }

    public int getMin() {
        return minElement;
    }
}
