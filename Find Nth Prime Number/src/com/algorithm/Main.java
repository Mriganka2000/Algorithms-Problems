package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int prime(int input1) {
        int num, count, i;
        num=1;
        count=0;

        while (count < input1){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){
                count = count+1;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        System.out.println(prime(nth));
    }
}
