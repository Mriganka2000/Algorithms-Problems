package com.algorithm;

public class Main {

    public static void main(String[] args) {
        LinkedLists head1 = new LinkedLists();
        LinkedLists head2 = new LinkedLists();
        head1.insert(1);
        head1.insert(3);
        head1.insert(5);
        head1.insert(7);
        head1.insert(9);
        head2.insert(2);
        head2.insert(4);
        head2.insert(6);
        head2.insert(8);
        head2.insert(10);
        Node node = head1.merge(head1.head, head2.head);
        head1.print(node.next);
    }
}
