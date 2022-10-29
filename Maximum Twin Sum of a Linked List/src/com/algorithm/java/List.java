package com.algorithm.java;

public class List {

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (prev != null) {
            head = prev;
        }

        return head;
    }

    public int pairSum(ListNode head) {
        int ans = Integer.MIN_VALUE;
        ListNode slow = head, fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        ListNode current = head;

        while (slow != null) {
            ans = Math.max(ans, current.val + slow.val);
            current = current.next;
            slow = slow.next;
        }

        return ans;
    }

}
