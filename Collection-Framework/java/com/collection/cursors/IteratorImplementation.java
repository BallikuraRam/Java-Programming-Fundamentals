package com.collection.cursors;

import java.util.*;

public class IteratorImplementation {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("Z");
        arrayList.add("D");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ");

        LinkedList linkedList = new LinkedList<>();
        linkedList.add(102);
        linkedList.add(101);
        linkedList.add(104);
        linkedList.add(103);

        Iterator iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println(" ");

        HashSet hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Iterator iterator2 = hashSet.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
