package com.collection.mapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class DiffHashMapAndIdentityHashMap {

    public static void main(String[] args) {

        // comparing the content of key to identify duplicates keys
        //HashMap will use Internally use Equals() method
        HashMap<String, Integer> hashMap = new HashMap<>();

        // equals method
        hashMap.put("R", 1); // 1. entry (SCP)
        hashMap.put("A", 2); // 1. entry (SCP)
        hashMap.put("M", 3); // 1. entry (SCP)

        // it will replace first entry bcz key is duplicate
        hashMap.put(new String("M"), 4);

        System.out.println("Size :" + hashMap.size());
        System.out.println(hashMap);


        System.out.println("++++++++++++++++++++++++++");

        //will compare address of keys to find duplicates (==)
        IdentityHashMap<String, Integer> hashMap1 = new IdentityHashMap<>();
        hashMap1.put("A", 1); // 1. entry (SCP)
        hashMap1.put("B", 2); // 1. entry (SCP)

        //duplicate value allowed old place replace new one
        hashMap1.put(new String("B"), 2); // 1 entry added (Heap Area)
        hashMap1.put("A", 3);

        System.out.println("Size :" + hashMap1.size());
        System.out.println(hashMap1);
    }
}
