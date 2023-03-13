package com.practice.collections;

import java.util.HashMap;

public class l_Size_of_HashMap {

    public static void main(String[] args) {
        // Creating HashMap object with Integer keys and String values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap object
        hashMap.put("R", 1);
        hashMap.put("A", 2);
        hashMap.put("M", 3);

        // Calculating the size of the HashMap using size() method
        System.out.println(hashMap.size());
    }
}
