package com.Releationship;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        count = count / 2;
        ListNode current = head;

        while(count != 0) {
            count--;
            current = current.next;
        }

        ListNode mid = reverse(current);
        current = head;

        while(mid != null) {
            if(current.val != mid.val) {
                return false;
            }
            current = current.next;
            mid = mid.next;
        }
        return true;
    }
}
public class Main
{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Solution s = new Solution();
        System.out.println(s.isPalindrome(head));
    }
}

