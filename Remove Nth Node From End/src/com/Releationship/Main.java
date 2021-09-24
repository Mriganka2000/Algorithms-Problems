package com.Releationship;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        else if(head.next == null) {
            return null;
        }
        else if(n == 1) {
            head = reverse(head);
            head = head.next;
            head = reverse(head);
            return head;
        }
        else {
            head = reverse(head);
            ListNode temp = head;
            ListNode prev = head;
            for (int i = 1; i < n; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            head = reverse(head);
            return head;
        }
    }

    public void print(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution s = new Solution();
        s.removeNthFromEnd(head, 2);
        s.print(head);
    }
}
