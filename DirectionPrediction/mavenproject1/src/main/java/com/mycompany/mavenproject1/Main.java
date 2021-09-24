/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author MRIGANKA
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char dir = 'R';
        int x = 0, y = 0;
        while (n > 0) {
            switch(dir) {
                case 'R':
                    x += Math.abs(x) + 10;
                    y = Math.abs(y);
                    dir = 'U';
                    break;
                case 'U':
                    y += Math.abs(y) + 20;
                    y = Math.abs(y);
                    dir = 'L';
                    break;
                case 'L':
                    x = -(x + 10);
                    dir = 'D';
                    break;
                case 'D':
                    y = -(y);
                    dir = 'L';
                    break;
            }
            
            n--;
        }
        
        System.out.println("The direction is :- " + x + " " + y);
    }
    
}
