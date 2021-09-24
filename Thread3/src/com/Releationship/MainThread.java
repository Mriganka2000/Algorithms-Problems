package com.Releationship;

class UserThread implements Runnable {
    Thread t;
    String name;

    UserThread(String name) {
        t = new Thread(this, name);
        this.name = name;
        t.start();
    }

    public void run() {
        try {
            if(this.name.equals("Good Morning")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Good Morning");
                    t.sleep(1000);
                }
            }
            else if(this.name.equals("Hello")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    t.sleep(2000);
                }
            }
            else if(this.name.equals("Welcome")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Welcome");
                    t.sleep(3000);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        UserThread u1 = new UserThread("Good Morning");
        UserThread u2 = new UserThread("Hello");
        UserThread u3 = new UserThread("Welcome");

// 		Thread t1 = new Thread(u1);
// 		Thread t2 = new Thread(u2);
// 		Thread t3 = new Thread(u3);
//
// 		t1.start();
// 		t2.start();
// 		t3.start();
    }
}

