package com.algorithm;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(11);

        LinkedList list = new LinkedList();
        System.out.println(list.maxSum(head));
    }
}
