package com.company;

import java.util.Scanner;

public class Main {

//    Greedy Algorithm

    public static int canComplete(int[] gas, int[] distance) {
        int tank = 0, total = 0, index = 0;
        for (int i = 0; i < gas.length; i++) {
            int consume = gas[i] - distance[i];
            tank += consume;
            if (tank < 0) {
                index = i + 1;
                tank = 0;
            }
            total += consume;
        }
        return total < 0 ? -1 : index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	    int[] gas = new int[n];
	    int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            distance[i] = scanner.nextInt();
        }
        System.out.println(canComplete(gas, distance));
    }
}
