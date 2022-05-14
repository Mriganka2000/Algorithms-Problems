package com.algorithm;

public class LinkedList {

    public Node head = null;

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next !=  null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public Node reverse(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (count != k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverse(next, k);
        }

        return prev;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
