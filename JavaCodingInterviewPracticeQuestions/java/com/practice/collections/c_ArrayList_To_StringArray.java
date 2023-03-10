package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class c_ArrayList_To_StringArray {
    public static void main(String[] args) {

        // Creating and initializing ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("R");
        arrayList.add("A");
        arrayList.add("M");

        // ArrayList to String Array Conversion
        String arr[] = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }

        // print the String Array
        System.out.println("Method1 : Using ArrayList class get() method\n");
        for (String a : arr) {
            System.out.print(a+" ");
        }
        System.out.println("  ");

        // ArrayList to String array conversion using toArray()
        String arr2[] = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("Method 2 : Using ArrayList class toArray() method");
        for (String a2:arr2)
        {
            System.out.print(a2+" ");
        }
        System.out.println("  ");
        //Converting ArrayList to String array using copyOf()
        String[] arr3 = Arrays.copyOf(arrayList.toArray() , arrayList.size() , String[].class);
        System.out.println("Converting ArrayList to String array using copyOf()");
        for (String a3:arr3)
        {
            System.out.print(a3+" ");
        }

    }
}
