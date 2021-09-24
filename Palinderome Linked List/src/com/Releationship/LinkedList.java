package com.Releationship;

public class LinkedList {
    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;

        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public boolean isPalindrome(Node head) {
        int length = 0;
        Node temp = head;

        while(temp != null) {
            temp = temp.next;
            length++;
        }
        temp = head;

        if(length % 2 == 0) {
            for (int i = 1; i < length/2; i++) {
                temp = temp.next;
            }
            Node second = reverse(temp);
            temp.next = null;
            Node first = head;
            while (first != null && second != null) {
                int val1 = first.data;
                int val2 = second.data;
                if (first.data != second.data) {
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
        }
        else {
            for (int i = 1; i < length/2; i++) {
                temp = temp.next;
            }
            Node second = reverse(temp.next.next);
            temp.next = null;
            Node first = head;
            while (first != null && second != null) {
                if (first.data != second.data) {
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
        }
    }
}
