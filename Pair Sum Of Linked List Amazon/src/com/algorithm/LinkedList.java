package com.algorithm;

public class LinkedList {

    private Node reverse(Node head) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        return head;
    }

    public int maxSum(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        int max = Integer.MIN_VALUE;

        while (slow != null) {
            int sum = slow.data + temp.data;
            if (sum > max) {
                max = sum;
            }
            slow = slow.next;
            temp = temp.next;
        }

        return max;
    }

}
