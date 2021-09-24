package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void findTime(double time, double trainA[]) {
        double startTimeA = trainA[0];

        if (time >= 0.00 && time <= 24.00) {
            for (int i = 0; i < trainA.length; i++) {
                double val = trainA[i] - startTimeA + time;
                int v = (int)time;
                if (val - v >= 0.599) {
                    val = val + 0.40;
                }
                if (val >= 24.00) {
                    val = val - 24.00;
                }
                System.out.println(String.format("%.2f", val));
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] trainA = {10.00, 10.04, 10.09, 10.15, 10.19, 10.22};
        System.out.print("Enter the start time :- ");
        double start = scanner.nextDouble();
        findTime(start, trainA);
    }
}
