package com.Releationship;

import java.util.List;
import java.util.LinkedList;

class Book {
    public String name;
    public String author;

    Book (String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Library {
    String name;
    List<Book> book;

    Library (String name, List<Book> book) {
        this.name = name;
        this.book = book;
    }
    public void show() {
        System.out.println("Name of library is :- " + name);
        System.out.println("Avaliable Books :- ");
        for (Book b : book) {
            System.out.println("Book name :- " + b.name + " | Author name :- " + b.author);
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Hebert Schieldt");
        Book b2 = new Book("C++", "Balaguruswami");
        Book b3 = new Book("C", "Balaguruswami");

        List<Book> book = new LinkedList<Book>();
        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library l = new Library("Panihati Branch", book);
        l.show();
    }
}
