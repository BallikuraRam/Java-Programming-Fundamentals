package com.practice.collections;

import java.util.HashMap;

public class m_How_to_check_if_HashMap_is_empty_or_Not {
    public static void main(String[] args) {

        System.out.println("1. Using isEmpty() method");
        // Creating HashMap object with String keys and INteger values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Checking whether HashMap is empty or not
        System.out.println("Before add elements to m=hasMap object :" + hashMap.isEmpty());

        // Adding elements to the HashMap object
        hashMap.put("A", 1);
        hashMap.put("B", 2);

        // Checking again whether HashMap is empty or not
        System.out.println("After adding element to the hashMap Object :" + hashMap.isEmpty());

        System.out.println("   ");


        System.out.println("2. Using size() method");
        // Creating HashMap object with String keys and String values
        HashMap<String, String> hashMap1 = new HashMap<>();
        // Checking whether HashMap is empty or not using size() method
        System.out.println("before adding elements to the hashMap ibject :" + (hashMap1.size() == 0));
        hashMap1.put("A", "B");
        hashMap1.put("C", "D");

        System.out.println("After adding element to the hashMap Object :" + (hashMap1.size() == 0));
    }
}
