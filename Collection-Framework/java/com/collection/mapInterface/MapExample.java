package com.collection.mapInterface;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        //key - value pairs
        Map<Integer, String> map = new HashMap<>();

        // add key-values
        map.put(101, "Ram");
        map.put(102, "Sowji");

        // some predefined methods to perform some operations

        // get Only keys
        Set<Integer> key = map.keySet();
        for (int keys : key) {
            System.out.println(keys);
            System.out.println("get values based on keys:" + map.get(keys));
        }

        // get Only Values
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.println(v);
        }

        //
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
        // forEach Loop
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}
