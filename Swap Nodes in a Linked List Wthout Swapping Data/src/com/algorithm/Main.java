package com.algorithm;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("Linked list before calling swapNodes() :- ");
        list.printList();

        list.swapNodes(4, 3);

        System.out.println("Linked list after calling swapNodes() :- ");
        list.printList();
    }
}
