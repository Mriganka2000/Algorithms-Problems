package com.Algorithm;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread 3 :- " + i + "\n");
        }
    }
}
