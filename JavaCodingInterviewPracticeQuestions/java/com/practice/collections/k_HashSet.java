package com.practice.collections;

import java.util.HashSet;

public class k_HashSet {
    public static void main(String[] args) {

        // declare hashset and type generic is Integer
        HashSet<Integer> integers = new HashSet<>();

        // add elements to hashset
        integers.add(1);

        // print the hashset using advanced for loop
        System.out.println("print hashset using advanced for loop ");
        for (int i : integers)
            System.out.println(i);
    }
}
