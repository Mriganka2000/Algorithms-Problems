package com.Releationship;

import java.util.*;

public class Main {

    public static int sum_odd_n(int n){
        if(n==1)
            return 1;
        if (n <= 0)
            return 0;
        return add(1, n);
    }

    public static int add(int num, int n) {
        if(n == 1)
            return num;
        return num + add(num+2, n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int r = sum_odd_n(count);
        System.out.println(r);
    }
}
