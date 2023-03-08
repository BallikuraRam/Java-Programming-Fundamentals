package com.practice.arrays;

public class Sum_Of_Array {
    public static void main(String[] args) {

        int a[] = {2, 3, 4, 5, 6};

        int sum = 0;

        // 1. use for Loop
        for (int i = 0; i <= a.length - 1; i++) // 0  1 2 3 4// a.length-1 = 4
        {
            sum = sum + a[i]; // 2 + 3 +4 + 5 + 6
        }
        System.out.println(sum); // 2+3+4+5+6 = 20

        // 2. use Enhanced for Loop (forEach loop)
        for (int value : a) {
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
