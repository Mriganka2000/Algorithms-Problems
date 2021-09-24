package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    Node head1 = new Node(1);
	    head1.next = new Node(3);
	    head1.next.next = new Node(5);
	    Node head2 = new Node(2);
	    head2.next = new Node(4);
	    head2.next.next = new Node(6);
	    head2.next.next.next = new Node(8);

	    LinkedLists linkedLists = new LinkedLists();
	    Node result = linkedLists.merge(head1, head2);
	    linkedLists.print(result);
	    Node reverse = linkedLists.reverse(result);
		System.out.println();
		linkedLists.print(reverse);
    }
}
