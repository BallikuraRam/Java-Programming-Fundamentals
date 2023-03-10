package com.collection.mapInterface;

import java.util.WeakHashMap;

public class DiffHashMapandWeakHashMap {
    public static void main(String[] args) {

        // it will fallow the descending order based on key
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(1, "hai");
        weakHashMap.put(3, "bye");
        weakHashMap.put(2, "hello");

        System.out.println(weakHashMap);
    }
}
