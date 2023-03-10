package com.collection.naturalSortingCustomObjects.comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        // comparable used to sort only single value
        // it's interface which is used to natural sorting based on the value
        List<Product> arrayList = new ArrayList<>();

        arrayList.add(new Product(103, "Soap", 3l , 3.5));
        arrayList.add(new Product(102, "Surf", 3l , 4.0));
        arrayList.add(new Product(104, "SurfXl", 4l , 4.5));
        arrayList.add(new Product(101, "Rin", 2l , 3.0));


        Collections.sort(arrayList);

        for (Product s : arrayList) {
            System.out.println(s);
        }

    }
}
