package com.Releationship;

import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n+1];
        return solve(0, n, memo);
    }

    private int solve(int i, int n, int memo[]) {
        if(i > n) {
            return 0;
        }
        if(i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = solve(i+1, n, memo) + solve(i+2, n, memo);
        return memo[i];
    }
}

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs :- ");
        int n = sc.nextInt();
        Solution s = new Solution();
        System.out.println("Ways are :- " + s.climbStairs(n));
    }
}
