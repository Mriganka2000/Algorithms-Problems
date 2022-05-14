package com.algorithm;

public class LinkedList {
    public ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        if (head == null) {
            head = new ListNode(data);
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
