package com.Releationship;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(10);

        Queue[] queueArray = splitQueue(queue);

        System.out.println("Elements in the queue of odd numbers");
        queueArray[0].display();

        System.out.println("\nElements in the queue of even numbers");
        queueArray[1].display();

    }

    public static Queue[] splitQueue(Queue queue) {
        Queue[] queueArray = new Queue[2];
        queueArray[0] = new Queue(queue.getMaxSize());
        queueArray[1] = new Queue(queue.getMaxSize());
        while(!queue.isEmpty()) {
            int val = queue.dequeue();
            if(val % 2 == 0) {
                queueArray[1].enqueue(val);
            }
            else {
                queueArray[0].enqueue(val);
            }
        }
        return queueArray;
    }
}

