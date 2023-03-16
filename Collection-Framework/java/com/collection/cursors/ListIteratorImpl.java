package com.collection.cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorImpl {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        ListIterator listIterator = arrayList.listIterator();
        System.out.println("array list ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println(" ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(" ");

        LinkedList linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        ListIterator listIterator1 = linkedList.listIterator();
        System.out.println("linked list ");
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }
        System.out.println(" ");
        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previous());
        }
    }
}
