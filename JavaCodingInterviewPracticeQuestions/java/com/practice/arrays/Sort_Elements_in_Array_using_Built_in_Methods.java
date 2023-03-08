package com.practice.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_in_Array_using_Built_in_Methods {
    public static void main(String[] args) {

        //1. Approach using parallelSort method
        int a[] = {1, 3, 4, 2, 6, 5};
        System.out.println("print the original array ");
        System.out.println(Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("sort array using parallelSort Method");
        System.out.println(Arrays.toString(a));

        //2. Approach directly
        Arrays.sort(a);
        System.out.println("sort array using sort Method");
        System.out.println(Arrays.toString(a));

        //3. Reverse Desending Order
        Integer a1[] = {2, 1, 3, 4, 8, 9, 7, 6};
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("sort array using Non Primitive data type and reverse()");
        System.out.println(Arrays.toString(a1));
    }
}
