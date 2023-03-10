package com.collection.naturalSortingCustomObjects;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass  {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println("Before sport "+arrayList);

        // sort the collection
        Collections.sort(arrayList);

        System.out.println("After sort "+arrayList);

        // reverse after sort
        Collections.reverse(arrayList);
        System.out.println("After Reve :"+arrayList);

    }
}
