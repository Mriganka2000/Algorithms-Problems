package com.algorithm;

import java.util.Stack;

class Queue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            return -1;
        }
        else {
            return stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }
}

public class Main {

    public static void main(String[] args) {
	    Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
