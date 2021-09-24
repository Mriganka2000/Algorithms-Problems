package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        System.out.println("The given BST :- ");
        tree.inOrder(tree.root);
        System.out.println();
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Node listHead = tree.bstToDLL(tree.root);
        System.out.println("The linked list :- ");
        doublyLinkedList.printList(listHead);
    }
}
