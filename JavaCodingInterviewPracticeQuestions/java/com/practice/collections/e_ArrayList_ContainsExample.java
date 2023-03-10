package com.practice.collections;

import java.util.ArrayList;

public class e_ArrayList_ContainsExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);

        // check if ArrayList contains element
        if (arrayList.contains(500)) {
            System.out.println("500 is found");
        } else {
            System.out.println("500 is not found ");
        }
    }
}
