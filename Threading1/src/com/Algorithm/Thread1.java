package com.Algorithm;

public class Thread1 extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread 1 :- " + i + "\n");
        }
    }
}
