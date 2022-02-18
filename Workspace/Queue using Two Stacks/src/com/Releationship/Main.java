package com.Releationship;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        while (n != 0) {
            int op = Integer.parseInt(scanner.next());
            switch (op) {
                case 1:
                    int data = Integer.parseInt(scanner.next());
                    queue.push(data);
                    break;
                case 2:
                    System.out.println(queue.pop());
                    break;
                case 3:
                    System.out.println(queue.top());
                    break;
            }
            n--;
        }
    }
}
