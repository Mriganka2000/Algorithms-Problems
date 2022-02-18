package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int hour = scanner.nextInt();
        if (distance == 0 || hour == 0) {
            System.out.println("Invalid Input");
        }
        else {
            if (distance <= 240 && hour <= 6) {
                System.out.println(2000);
            }
            else if (distance > 240 && hour <= 6) {
                int extra = distance - 240;
                int total = 2000 + extra * 100;
                System.out.println(total);
            }
            else if (hour > 6 && distance <= 240) {
                int extra = hour - 6;
                int total = 2000 + extra * 20;
                System.out.println(total);
            }
            else {
                int time = hour - 6;
                int dist = distance - 240;
                int total = time * 20 + dist * 100 + 2000;
                System.out.println(total);
            }
        }
    }
}
