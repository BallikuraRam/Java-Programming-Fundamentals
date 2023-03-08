package com.practice.arrays;

import java.util.Arrays;

public class Sort_Elements_in_Array_using_BubbleSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 5, 4};

        System.out.println("Before Sort :" + Arrays.toString(a));

        int len = a.length;

        for (int i = 0; i < len - 1; i++) // Number of passes
        {
            for (int j = 0; j < len - 1; j++) // Iterations in Each Pass
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sort :" + Arrays.toString(a));
    }
}
