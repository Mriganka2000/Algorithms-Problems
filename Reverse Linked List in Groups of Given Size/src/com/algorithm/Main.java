package com.algorithm;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);

        System.out.println("Given Linked List :- ");
        list.printList();

        list.head = list.reverse(list.head, 3);

        System.out.println("Reversed list :- ");
        list.printList();
    }
}
