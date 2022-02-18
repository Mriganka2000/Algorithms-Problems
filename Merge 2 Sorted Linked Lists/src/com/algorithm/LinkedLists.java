package com.algorithm;

public class LinkedLists {

    public Node head = null;

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public Node merge(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2, head3 = new Node(0);
        Node temp = head3;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = new Node(temp1.data);
                temp = temp.next;
                temp1 = temp1.next;
            }
            else {
                temp.next = new Node(temp2.data);
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            temp.next = new Node(temp1.data);
            temp = temp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            temp.next = new Node(temp2.data);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return head3;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
