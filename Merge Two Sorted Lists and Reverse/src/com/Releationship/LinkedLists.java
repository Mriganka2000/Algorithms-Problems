package com.Releationship;

public class LinkedLists {
    public Node merge(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node result = null;

        if (temp1.data < temp2.data) {
            result = new Node(temp1.data);
            temp1 = temp1.next;
        }
        else if (temp1.data > temp2.data) {
            result = new Node(temp2.data);
            temp2 = temp2.next;
        }

        Node temp = result;
        while (temp1 != null && temp2 !=  null) {
            if (temp1.data < temp2.data) {
                temp.next = new Node(temp1.data);
                temp = temp.next;
                temp1 = temp1.next;
            }
            else if (temp1.data > temp2.data) {
                temp.next = new Node(temp2.data);
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            temp.next = new Node(temp1.data);
            temp = temp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            temp.next = new Node(temp2.data);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return result;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

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
}
