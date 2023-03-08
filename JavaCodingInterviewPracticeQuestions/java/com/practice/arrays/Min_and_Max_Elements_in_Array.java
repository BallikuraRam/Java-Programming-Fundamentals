package com.practice.arrays;

public class Min_and_Max_Elements_in_Array {
    public static void main(String[] args) {
        int a[] = {10 , 20 ,50 ,90};
        int max = a[0];

        // min value based on the range
        for (int i = 1 ; i< a.length; i++) // 20 50 90
        {
            if (a[i] > max) // 20 > 10 = 20 -> 50 > 20 = 50 -> 50 > 90
            {
                max = a[i]; // 20 -> 50  -> 90
            }
        }
        System.out.println("Maximum Value :"+ max);

        int min = a[0];
        for (int i = 1 ; i <a.length ; i++) // 10 50 90
        {
            if (a[i] < min){ // 20 < 10 = 10 -> 50 < 10 = 10 -> 90 < 10 = 10 min
                min = a[i]; // min = a[i] = 10 = 10 -> 10
            }
        }
        System.out.println("Minimum Value :"+ min);

        System.out.println("Difference between max and min "+ (max - min));
    }
}
