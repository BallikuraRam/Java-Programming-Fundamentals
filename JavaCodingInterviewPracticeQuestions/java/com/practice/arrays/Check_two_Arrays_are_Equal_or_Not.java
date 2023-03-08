package com.practice.arrays;

import java.util.Arrays;

public class Check_two_Arrays_are_Equal_or_Not {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {1, 2, 3, 4};

        // 1. approach
//        boolean status = Arrays.equals(a, b);
//        if (status == true) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }

        // approach 2

        boolean status = true;
        if (a.length == b.length) {
            // compare two arrays
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }
        if (status == true) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
