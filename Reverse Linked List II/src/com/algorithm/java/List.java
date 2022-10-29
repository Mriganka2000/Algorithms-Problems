package com.algorithm.java;

public class List {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }

        ListNode connection = prev;
        ListNode tail = current;

        while (right > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }

        if (connection != null) {
            connection.next = prev;
        }
        else {
            head = prev;
        }

        tail.next = current;

        return head;
    }

    public void print(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
