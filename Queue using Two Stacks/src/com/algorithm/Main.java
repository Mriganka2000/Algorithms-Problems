package com.algorithm;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();

        while(!queue.isEmpty()) {
            System.out.println(queue.front());
            queue.dequeue();
        }
    }
}
