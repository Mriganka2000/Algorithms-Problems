package com.Releationship;

class Bike {
    int speed = 90;
    public int get() {
        return speed;
    }
}

class Honda extends Bike {
    int speed = 150;
    public int get() {
        return speed;
    }
}

public class Main
{
    public static void main(String[] args) {
        Bike b = new Bike();
        Honda h = new Honda();
        Bike hb = new Honda();
        System.out.println(b.speed);
        System.out.println(h.speed);
        System.out.println(hb.speed);
        System.out.println(b.get());
        System.out.println(h.get());
        System.out.println(hb.get());
    }
}
