package com.Releationship;

import java.util.Scanner;

public class Main {
    public static boolean isPerfectSquare(int num) {
        long l=0;
        long r=num;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return num==1?true:false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
