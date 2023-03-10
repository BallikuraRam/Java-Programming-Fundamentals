package com.practice.collections;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class h_ArrayLis_SizeExample {

    public static void main(String[] args) {

        System.out.println("1. Java Program to find Length/Size of Integer ArrayList");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("before elements add size ");
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        integerArrayList.add(10);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(87);

        System.out.println("after elements add size ");
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        integerArrayList.remove(2);

        System.out.println("after remove element size ");
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        System.out.println("finally list ");
        for (int i : integerArrayList) {
            System.out.print(i + " ");
        }
        System.out.println(" ");


        System.out.println("2. Java Program to find Length/Size of String ArrayList");
        ArrayList<String> list = new ArrayList<>();
        System.out.println("before add size");
        System.out.println(list.size());

        list.add("R");
        list.add("A");
        list.add("M");

        System.out.println("after add size");
        System.out.println(list);
        System.out.println(list.size());

        list.remove(1);
        System.out.println("after remove size");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("final Array List ");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
