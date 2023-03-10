package com.collection.listInterface.linkedList;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        // internal Data Structure is double linkedList
        // it will store the objects in node format
        // there is no default size
        LinkedList list = new LinkedList<>();

        // add values is better than ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(1, 5);
        System.out.println(list);

        // Get data is Much slow performance from Arraylist
        System.out.println(list.get(3));
        System.out.println(list.get(0));
    }
}
