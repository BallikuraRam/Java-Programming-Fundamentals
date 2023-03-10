package com.collection.listInterface.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {

        //Vector is used for Thread Safe
        Vector vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        Enumeration<Integer> integerEnumeration = vector.elements();
        while (integerEnumeration.hasMoreElements())
        {
            System.out.println(integerEnumeration.nextElement());
        }
    }
}
