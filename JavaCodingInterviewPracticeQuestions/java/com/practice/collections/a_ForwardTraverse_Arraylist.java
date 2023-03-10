package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class a_ForwardTraverse_Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        //There are 5 ways you can iterate through an ArrayList
        //1. Iterate ArrayList using For loop
        System.out.println("There are 5 ways you can iterate through an ArrayList");
        System.out.println("1. Iterate ArrayList using For loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //2. Iterate ArrayList using Advanced for loop
        System.out.println("2. Iterate ArrayList using Advanced for loop");
        for (Integer a : arrayList) {
            System.out.println(a);
        }

        //3. Iterate ArrayList using the While loop
        System.out.println("3. Iterate ArrayList using the While loop");
        int c = 0;
        while (arrayList.size() > c) {
            System.out.println(arrayList.get(c));
            c++;
        }

        //4. Iterate ArrayList using Iterator
        System.out.println("4. Iterate ArrayList using Iterator");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //5. Iterate ArrayList using Stream API (Java 8)
        System.out.println("5. Iterate ArrayList using Stream API (Java 8)");
        arrayList.forEach((n) -> {
            System.out.println(n);
        });

    }
}
