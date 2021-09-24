package com.Releationship;

import java.util.Stack;

public class StackClass {

    public Stack<Integer> mainStack;
    public Stack<Integer> auxStack;

    public StackClass() {
        mainStack = new Stack<>();
        auxStack = new Stack<>();
    }

    public void _push(int data) {
        if (mainStack.isEmpty() && auxStack.isEmpty()) {
            mainStack.push(data);
            auxStack.push(data);
        }
        mainStack.push(data);
        if (mainStack.peek() < auxStack.peek()) {
            auxStack.push(data);
        }
        else {
            auxStack.push(auxStack.peek());
        }
    }

    public int _pop() {
        int val = auxStack.pop();
        return mainStack.pop();
    }

    public int getMin() {
        return auxStack.peek();
    }
}
