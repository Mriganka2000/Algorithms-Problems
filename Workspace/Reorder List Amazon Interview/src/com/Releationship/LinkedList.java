package com.Releationship;

public class LinkedList {
    public Node reverse(Node head) {
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

    public void reorder(Node head) {
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        head = new Node(0);
        Node temp = head;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
            if (head2 != null) {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        head = head.next;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
