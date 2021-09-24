package com.Algorithm;

public class GoodMorning extends Thread{
    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
