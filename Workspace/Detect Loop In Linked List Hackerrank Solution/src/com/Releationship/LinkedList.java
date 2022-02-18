package com.Releationship;

public class LinkedList {

    public boolean hasLoop(Node head) {
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.data == fast.data) {
                return true;
            }
        }

        return false;
    }

}
