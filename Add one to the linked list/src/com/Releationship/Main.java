package com.Releationship;

public class Main
{
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        l.insert(1);
        l.insert(9);
        l.insert(9);
        l.insert(9);
        System.out.println("The list is :- ");
        l.print();
        l.addOne();
        System.out.println("After add 1 :- ");
        l.print();
    }
}
