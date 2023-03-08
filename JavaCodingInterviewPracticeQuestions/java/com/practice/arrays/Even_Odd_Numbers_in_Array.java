package com.practice.arrays;

public class Even_Odd_Numbers_in_Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 1. using for loop
        System.out.println("Even Numbers :");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }

        System.out.println("Odd Numbers : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.println(a[i]);
        }

        // 2.using enhanced for loop
        for (int value : a) {
            if (value % 2 == 0)
                System.out.println(value);
        }

        for (int v : a) {
            if (v % 2 != 0)
                System.out.println(v);
        }


    }
}
