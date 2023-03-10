package com.collection.setInterface;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        // internal dataStructure is BinaryTrees
        TreeSet treeSet = new TreeSet<>();

        // duplicates and null not allowed
        // fallow natural insertion order
        treeSet.add("A");
        treeSet.add("B");

        // try to add new different data type we face ClassCastException
//        treeSet.add(1);

        // null are not allowed and face NullPoinerException
//        treeSet.add(null);

        // print the treeSet
        System.out.println(treeSet);
    }
}
