package com.algorithm;

public class List {
    public ListNode head = null;

    public void insert(int data) {
        if (head == null) {
            head = new ListNode(data);
        }
        else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            ListNode newNode = new ListNode(data);
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void print() {
        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printReverse() {
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public void reverse() {
        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }
}
