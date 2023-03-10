package com.collection.mapInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer , String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(101 , "A");
        hashMap.put(102 , "B");
        hashMap.put(103 , "C");

        Set<Integer> keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println(hashMap);
    }
}
