package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int maxPowerOfPrimeNumbers = 0;
            int minPf = 0;
            for(int i = 2; i * i <= n; i++){
                if(n % i == 0){
                    int power = 0;
                    while (n % i == 0){
                        n /= i;
                        power++;
                    }
                    if(power > maxPowerOfPrimeNumbers){
                        maxPowerOfPrimeNumbers = power;
                        minPf = i;
                    }
                }
            }
            if(maxPowerOfPrimeNumbers == 0) {
                minPf = n;
            }
            System.out.println(minPf);
        }
    }
}
