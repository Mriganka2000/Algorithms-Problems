package com.Algorithm;

public class Main {

    public static void main(String[] args) {
	    Thread1 t1 = new Thread1();
	    Thread2 t2 = new Thread2();
	    Thread3 t3 = new Thread3();

	    Thread thread1 = new Thread(t1);
	    Thread thread2 = new Thread(t2);
	    Thread thread3 = new Thread(t3);

	    thread1.start();
	    thread2.start();
	    thread3.start();
    }
}
