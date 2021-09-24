package com.Releationship;

public class Main {

    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass._push(3);
        stackClass._push(2);
        stackClass._push(4);
        stackClass._push(5);
        stackClass._push(1);
        int val = stackClass._pop();

        System.out.println("The min element of the stack is :- " + stackClass.getMin());

        _Stack _stack = new _Stack();
        _stack._push(3);
        _stack._push(2);
        _stack._push(4);
        _stack._push(5);
        _stack._push(1);
        int ele = _stack._pop();

        System.out.println("The min element of the stack is :- " + _stack.getMin());
    }
}
