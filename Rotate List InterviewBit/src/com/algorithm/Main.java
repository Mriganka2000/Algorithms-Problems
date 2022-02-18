package com.algorithm;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode ans = list.rotateRight(head, 2);
        while (ans != null) {
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
}
