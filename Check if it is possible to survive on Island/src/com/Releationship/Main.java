package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Maximum unit of food I can buy each day :- ");
        int N = scanner.nextInt();
        System.out.print("Enter the Number of days I have to survive :- ");
        int S = scanner.nextInt();
        System.out.print("Enter the Unit of food required each day to survive :- ");
        int M = scanner.nextInt();

        if (M >= N && S >= 6) {
            System.out.println("No");
        }
        else {
            int days = (M * S) / N;
            if ((M * S) % N != 0) {
                days++;
            }
            System.out.println("Yes " + days);
        }
    }
}
