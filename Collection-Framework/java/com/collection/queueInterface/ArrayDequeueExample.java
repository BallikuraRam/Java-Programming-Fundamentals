package com.collection.queueInterface;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        //add and remove first and as well as last also
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");

        //add first
        arrayDeque.addFirst("D");

        // add last
        arrayDeque.addLast("F");

        System.out.println(arrayDeque);

        //remove first object
        arrayDeque.pollFirst();
        System.out.println(arrayDeque);

        // remove last object
        arrayDeque.pollLast();
        System.out.println(arrayDeque);
    }
}
