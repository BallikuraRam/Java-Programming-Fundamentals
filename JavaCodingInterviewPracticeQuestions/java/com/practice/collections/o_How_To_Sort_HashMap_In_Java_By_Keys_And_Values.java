package com.practice.collections;

import java.util.*;

public class o_How_To_Sort_HashMap_In_Java_By_Keys_And_Values {
    public static void main(String[] args) {
        hashMapSortByKeyExample();
    }

    public static void hashMapSortByKeyExample() {

        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashmap  = new HashMap<>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(225,"A");
        hashmap.put(550,"B");
        hashmap.put(33,"Z");
        hashmap.put(440,"M");
        hashmap.put(99,"I");
        hashmap.put(886,"X");

        System.out.println("Before sorting ..........");
        Set set = hashmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print(pair.getKey() + ":");
            System.out.println(pair.getValue());
        }
        System.out.println("After sort ..........");
        Map<Integer,String> map = new TreeMap<Integer,String>(hashmap);
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator1.next();
            System.out.print(entry.getKey()+":");
            System.out.println(entry.getValue());
        }
    }
    //In this example we are sorting HashMap by values using Comparator.
    public static void hashMapSortByValueExample()
    {

    }
}
