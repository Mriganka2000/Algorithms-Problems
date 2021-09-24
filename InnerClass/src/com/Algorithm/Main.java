package com.Algorithm;

class Base {
    private class Inner {
        public void show() {
            System.out.println("From inner class");
        }
    }

    Inner i = new Inner();
    public void getInner() {
        i.show();
    }
}

public class Main {

    public static void main(String[] args) {
	    Base b = new Base();
	    b.getInner();
    }
}
