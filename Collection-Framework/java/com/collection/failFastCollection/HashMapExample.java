package com.collection.failFastCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(101, "A");
        hashMap.put(102, "B");
        hashMap.put(103, "C");

//        System.out.println(hashMap);

        Set<Integer> ketSet = hashMap.keySet();
        Iterator iterator = ketSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            hashMap.put(105, "D");
        }
        System.out.println(hashMap);
    }
}
