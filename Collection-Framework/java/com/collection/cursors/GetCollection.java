package com.collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GetCollection {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        // 1. Approach
        System.out.println("===For Loop===");
        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

        //2. Approach
        System.out.println("===For Each Loop===");

        for (Object object : list)
        {
            System.out.println(object);
        }

        //3. iterator()
        System.out.println("===IteratorImplementation forward direction===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //4. iterator()
        System.out.println("===ListIterator interface forward and backward direction===");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println(" ");
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }

        //5. forEach() method Approach
        System.out.println("===ForEach() Method===");
        list.forEach (i -> {
            System.out.println(i);
        });

    }
}
