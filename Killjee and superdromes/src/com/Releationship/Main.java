package com.Releationship;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int count = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 2;
            arrayList.add(rem);
            n = n / 2;
            count++;
        }

//        for (int i = 0; i < count; i++) {
//            System.out.println(arrayList.get(count-i-1));
//        }

        boolean flag = true;
        for (int i = 0; i < count; i++) {
            if (arrayList.get(i) != arrayList.get(count-i-1)) {
                flag = false;
                break;
            }
        }

        int num = temp, sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + num;
            num = num / 10;
        }

        if (flag && sum == temp) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
