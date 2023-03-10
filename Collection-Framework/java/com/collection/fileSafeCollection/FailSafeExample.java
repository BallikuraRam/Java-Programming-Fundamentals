package com.collection.fileSafeCollection;

import java.util.concurrent.CopyOnWriteArrayList;

// immediate error will not throw
public class FailSafeExample {
    public static void main(String[] args) {


        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        copy.add(100);
        copy.add(200);
        copy.add(300);
        copy.add(400);

        for (Integer c : copy) {
            System.out.println(c);
            if (c == 100) {
                copy.add(150);
            }
        }
        System.out.println(copy);
    }
}
