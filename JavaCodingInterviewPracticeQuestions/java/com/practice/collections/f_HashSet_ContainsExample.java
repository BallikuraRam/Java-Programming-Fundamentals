package com.practice.collections;

import java.util.HashSet;

public class f_HashSet_ContainsExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B");

        // check if HashSet contains element
        if (hashSet.contains("F")) {
            System.out.println("is Available");
        } else {
            System.out.println("Not available ");
        }
    }
}
