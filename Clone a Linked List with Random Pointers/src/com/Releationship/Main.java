package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    LinkedList linkedList = new LinkedList();
	    linkedList.head = new Node(1);
	    linkedList.head.next = new Node(2);
	    linkedList.head.next.next = new Node(3);
	    linkedList.head.next.next.next = new Node(4);

	    linkedList.head.random = linkedList.head.next.next;
	    linkedList.head.next.random = linkedList.head.next.next.next;
	    linkedList.head.next.next.random = linkedList.head;

	    linkedList.print(linkedList.head);
    }
}
