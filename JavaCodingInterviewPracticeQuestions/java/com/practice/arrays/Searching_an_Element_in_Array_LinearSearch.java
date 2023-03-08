package com.practice.arrays;

public class Searching_an_Element_in_Array_LinearSearch {
    public static void main(String[] args) {
        int a[] = {10, 50, 70, 80, 30, 60, 20};

        int search_ele = 200;

        boolean status = false;
        for (int i = 0; i < a.length; i++) {
            if (search_ele == a[i]) {
                System.out.println("Element found at :" + i);
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println("element not found ");
        }
    }
}
