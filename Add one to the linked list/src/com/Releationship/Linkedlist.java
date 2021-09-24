package com.Releationship;

public class Linkedlist {
    public Node head;

    public Linkedlist() {
        this.head = null;
    }

    public void insert(int data) {
        if(head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    private Node reverse(Node head) {
        Node current = head, prev = null, next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public void addOne() {
        Node temp = reverse(head);
        Node temp1 = temp;
        int sum = 0, carry = 1;
        while(temp != null) {
            sum = (temp.data + 1) % 10;
            carry = (temp.data + 1) / 10;
            temp.data = sum;
            temp = temp.next;
        }
        head = reverse(temp1);
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}