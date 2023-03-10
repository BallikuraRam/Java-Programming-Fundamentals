package com.practice.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class b_BackwardTraversing_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("F");

        System.out.println("Original ArrayList");
        System.out.println(al);

        System.out.println("There are 3 ways you can iterate through an ArrayList");
        System.out.println("1. Iterate ArrayList using For loop");
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.print(al.get(i));
        }
        System.out.println("  ");

        System.out.println("2. Iterate ArrayList using ListIterator");
        ListIterator listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println("  ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }
        System.out.println("  ");
        System.out.println("3. Iterate ArrayList using Stream API (Java 8)");
        String c = al.stream().reduce((a, b) -> b + " " + a)
                .orElse("");
        System.out.println(c);
    }
}
