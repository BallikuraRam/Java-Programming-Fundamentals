package com.collection.listInterface.stack;

import java.util.Stack;

public class Exampe {
    public static void main(String[] args) {

        Stack stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.peek()); // top element
        System.out.println(stack.pop()); // remove top element
        System.out.println(stack);
    }
}
