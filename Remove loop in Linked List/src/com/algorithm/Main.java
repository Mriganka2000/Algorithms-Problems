package com.algorithm;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        head.next.next.next.next.next = head.next.next;

        List list = new List();

        System.out.println(list.detectLoop(head));
        list.print(head);
    }
}
