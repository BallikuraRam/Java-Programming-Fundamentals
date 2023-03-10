package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class g_ConvertArray_To_ArrayList {
    public static void main(String[] args) {

        //1.  Declaring and initializing Array
        System.out.println("Method 1 : Using Arrays.asList() method");
        String[] counties = {"Ind", "Pak", "Ban", "Aus"};

        //Converting Array to ArrayList using Arrays.asList()
        ArrayList<String> list = new ArrayList<>(Arrays.asList(counties));

        // Add more elements to the converted list
        list.add("Sa");
        list.add("Sl");

        // Print arraylist elements using for-each loop
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(" ");


        //2. Converting Array to ArrayList using addAll() method
        System.out.println("Method 2 : Using Collections.addAll() method");
        String[] arr1 = {"A", "B", "C"};
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr1);

        // Add more elements to the converted list
        arrayList.add("D");
        arrayList.add("F");

        // Displaying arraylist elements using for-each loop
        for (String s1 : arrayList) {
            System.out.print(s1 + " ");
        }
        System.out.println(" ");


        //3. Converting Array to ArrayList manually
        System.out.println("Method 3 : Using add() method");
        String[] arr2 = {"R", "A", "M"};
        ArrayList<String> arrayList1 = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            // Adding every element of array to the ArrayList
            arrayList1.add(arr2[i]);
        }
        // Showing arraylist elements using for-each loop
        for (String s3 : arrayList1) {
            System.out.print(s3 + " ");
        }

    }
}
