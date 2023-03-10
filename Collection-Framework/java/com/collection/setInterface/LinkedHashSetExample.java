package com.collection.setInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // internal dataStructure is hashTable + double linkedList
        // duplicates are not allowed

        // capacity 16 and load factor 0.75
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // insertion order will fallow
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(null);
        linkedHashSet.add(3);

        // print the linkedHashSet
        System.out.println(linkedHashSet);
    }
}
