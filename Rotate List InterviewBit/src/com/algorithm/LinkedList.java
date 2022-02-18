package com.algorithm;

public class LinkedList {

    public int findLength(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int l = findLength(head);
        
        if (k % l == 0) {
            return head;
        }

        for (int i = 0; i < l - k % l - 1; i++) {
            temp = temp.next;
        }

        ListNode head2 = temp.next;
        temp.next = null;

        ListNode last = head2;
        while (last.next != null) {
            last = last.next;
        }

        last.next = head;
        head = head2;

        return head;
    }
}
