/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.checkpasswordaccenture;

import java.util.Scanner;

/**
 *
 * @author MRIGANKA
 */
public class CheckPassword {
    
    public static boolean check(String str, int min) {
        if (str.length() < min) {
            return false;
        }
        
        if (Character.isDigit(str.charAt(0))) {
            return false;
        }
        
        int nd = 0, ca = 0;
        boolean sorp = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                nd++;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                ca++;
            }
            if (str.charAt(i) == ' ' || str.charAt(i) == '+') {
                sorp = true;
            }
        }
        
        if (nd != 0 && ca != 0 && sorp == false) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int min = sc.nextInt();
        
        System.out.println(check(str, min));
    }
    
}
