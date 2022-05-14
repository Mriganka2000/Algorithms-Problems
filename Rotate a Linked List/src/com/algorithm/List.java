package com.algorithm;

public class List {
    public void rotate(Node head, int k) {
        Node pre = null;
        Node ptr = head;

        while (k-- > 0) {
            pre = ptr;
            ptr = ptr.next;
        }

        if (pre != null) {
            pre.next = null;
        }

        if (ptr != null) {
            Node temp = ptr;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = head;
            print(ptr);
        }
        else {
            print(head);
        }
    }

    private void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
