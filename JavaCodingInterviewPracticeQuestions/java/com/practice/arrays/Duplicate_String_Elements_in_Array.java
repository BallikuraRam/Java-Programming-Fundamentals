package com.practice.arrays;

import java.util.HashSet;

public class Duplicate_String_Elements_in_Array {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d", "e", "a"};

        //1. Approach for loop
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found Duplicate :" + arr[i]);
                    status = true;
                }
            }
        }
        if (status == false) {
            System.out.println("did not found any duplicates :");
        }
        //2. Approach HashSet
        // HashSet does not allow duplicated

        HashSet<String> hashSet = new HashSet<>();

        for (String l : arr) {
            if (hashSet.add(l) == false) {
                System.out.println("found duplicate :" + l);
                status = true;
            }
        }
        if (status == false) {
            System.out.println("not found duplicates ");

        }
    }
}
