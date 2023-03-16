package com.practice.collections;

import java.util.HashSet;
import java.util.Iterator;

public class d_HashSet_IteratorExample {
    public static void main(String[] args) {
        // Declaring a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to HashSet
        hashSet.add("Hi");
        hashSet.add("How");
        hashSet.add("Are");
        hashSet.add("You");

        // Get iterator
        Iterator iterator = hashSet.iterator();
        // Show HashSet elements
        System.out.println("1. Program for How to Iterate HashSet  Using IteratorImplementation");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println(" ");

        // 2.   Program for How to Iterate HashSet using for each loop
        System.out.println("2.   Program for How to Iterate HashSet using for each loop");
        for (String s : hashSet)
        {
            System.out.print(s+" ");
        }
    }
}
