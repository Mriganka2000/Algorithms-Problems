package com.Algorithm;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        System.out.printf("%s", q);
        System.out.println();
        System.out.printf("%s", q.peek());
        System.out.println();
    }
}
