package com.Algorithm;

public class Welcome extends Thread{
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
