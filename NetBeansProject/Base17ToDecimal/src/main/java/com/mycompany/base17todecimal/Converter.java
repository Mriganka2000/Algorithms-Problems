/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.base17todecimal;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MRIGANKA
 */
public class Converter {
    
    public static long convert(String str) {
        long result = 0;
        int base = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        hashMap.put('A', 10);
        hashMap.put('B', 11);
        hashMap.put('C', 12);
        hashMap.put('D', 13);
        hashMap.put('E', 14);
        hashMap.put('F', 15);
        hashMap.put('G', 16);
        hashMap.put('a', 10);
        hashMap.put('b', 11);
        hashMap.put('c', 12);
        hashMap.put('d', 13);
        hashMap.put('e', 14);
        hashMap.put('f', 15);
        hashMap.put('g', 16);
        
        for (int i = str.length()-1; i >= 0; i--) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                int val = Integer.parseInt(String.valueOf(str.charAt(i)));
                result = result + val * (int)Math.pow(17, base);
            }
            else {
                int val = hashMap.get(str.charAt(i));
                result = result + val * (int)Math.pow(17, base);
            }
            base++;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("The decimal value is :- " + convert(str));
    }
    
}
