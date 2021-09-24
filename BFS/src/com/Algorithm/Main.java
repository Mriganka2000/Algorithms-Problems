package com.Algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char option;
        System.out.print("Enter the number of vertices :- ");
        int v = s.nextInt();
        Graph g = new Graph(v);
        do {
            System.out.println("Enter the vertex and edge weight :- ");
            int source = s.nextInt();
            int weight = s.nextInt();
            g.addEdge(source, weight);
            System.out.print("Do you want to continue 0 or 1 :- ");
            option = s.next().charAt(0);
        }while(option != 'n');
        System.out.print("Enter the source vertex :- ");
        int start = s.nextInt();
        g.breadthFirstSearch(start);
    }
}
