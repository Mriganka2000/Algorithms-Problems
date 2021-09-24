package com.Algorithm;

public class Thread2 extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread 2 :- " + i + "\n");
        }
    }
}
