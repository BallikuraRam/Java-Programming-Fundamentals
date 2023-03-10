package com.collection.listInterface.arraylist;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        // we did not create object of interface
       //  List l = new  List();
        List list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(0, 500);

        System.out.println("print list:"+ list);
        System.out.println("Print size of list :"+ list.size());
        System.out.println("remove obj "+ list.remove(1));
        System.out.println("get obj based on index :"+ list.get(2));
        System.out.println("contains obj in list "+ list.contains(5000));
        //list.clear();
        System.out.println("clear all objects in cillection :"+ list);
//        list.isEmpty();
        System.out.println(list);
        System.out.println(list.indexOf(100));

        // ArrayList default size is 10
        // Object Creation
        ArrayList arrayList = new ArrayList<>();

        // add any type(Homo + hetero) of values
        arrayList.add(01);
        arrayList.add("Ram");
        arrayList.add('M');
        arrayList.add(12500.08080);
        arrayList.add(984845574);

        System.out.println("Print ArrayList ");
        System.out.println(arrayList);

        System.out.println("Print size ");
        System.out.println(arrayList.size());

        System.out.println("Remove Element Based on Index");
        System.out.println(arrayList.remove(0));

        System.out.println("print after remove the element ");
        System.out.println(arrayList.size());

        System.out.println(arrayList.get(3));

        // we can store the only type generics
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);
        integerList.add(500);
        integerList.add(600);
        System.out.println(integerList);

        List<String> stringList =new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        System.out.println(stringList);

        List<Character> characterList = new ArrayList<>();
        characterList.add('r');
        characterList.add('a');
        characterList.add('m');
        System.out.println(characterList);

    }
}
