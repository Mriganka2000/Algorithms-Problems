package com.Algorithm;

public class WelcomeThread {
    public static void main (String args[]) {
        Welcome w = new Welcome();
        GoodMorning g = new GoodMorning();

        w.start();
        g.start();
    }
}
