package com.collection.setInterface;

import com.collection.listInterface.arraylist.Student;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        //capacity 16 and load factor 0.75
        //internal dataStructure is hashTable
        // Object creation
        HashSet hashSet = new HashSet<>();

        // not fallow the insertion order
        hashSet.add("1");
        hashSet.add("Ram");

        // print hashSet
        System.out.println(hashSet);

        // for particular Object
        HashSet<Student> studentHashSet = new HashSet<>();

        studentHashSet.add(new Student(101, "Ram" , 1));
        studentHashSet.add(new Student(102, "Sowji" , 2));
        studentHashSet.add(new Student(103, "Naveen" , 3));

        // print the hashSet
        System.out.println(studentHashSet);

        // print the Traverse Using Iterator interface
        Iterator iterator = studentHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
