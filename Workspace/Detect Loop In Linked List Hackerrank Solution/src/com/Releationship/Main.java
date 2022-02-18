package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    Node head = new Node(1);
	    head.next = new Node(2);
	    head.next.next = new Node(3);
	    head.next.next.next = new Node(4);
	    head.next.next.next.next = new Node(5);
	    head.next.next.next.next.next = new Node(6);
	    head.next.next.next.next.next.next = head.next.next;

	    LinkedList list = new LinkedList();
        System.out.println(list.hasLoop(head));
    }
}
