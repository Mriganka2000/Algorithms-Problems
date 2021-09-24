package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        LinkedList linkedList = new LinkedList();
        boolean val = linkedList.isPalindrome(head);
        System.out.println(val);
    }
}
