package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

class Stack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue2.add(x);

        while(!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.remove();
        }

        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }

    public int pop() {
        if (queue1.isEmpty()) {
            return -1;
        }
        else {
            int val = queue1.peek();
            queue1.remove();
            return val;
        }
    }

    public int top() {
        return queue1.peek();
    }
}

public class Main
{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
