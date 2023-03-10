package com.collection.failFastCollection;

import java.util.ArrayList;

// immediate error will throw
public class FailFastExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        //Exception in thread "main" java.util.ConcurrentModificationException
        for (int a : arrayList) {
            System.out.println(a);
            if (a == 100) {
                arrayList.add(150);
            }
        }
        System.out.println(arrayList);
    }
}
