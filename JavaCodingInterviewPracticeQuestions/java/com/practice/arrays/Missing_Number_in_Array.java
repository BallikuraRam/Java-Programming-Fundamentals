package com.practice.arrays;

public class Missing_Number_in_Array {
    public static void main(String[] args) {

        // Array should not have duplicates
        // Array no need to be sorted order
        // values should be range

        int a[] = {2, 5, 4, 3};
        int sum = 0;

        // 2 + 5 + 4 + 3 = sum
        // 1 +2 + 3 + 4 + 5= sum1
        // sum1 - sum = missing number

        // print the sum
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum of array :"+ sum);

        // print the sum according to the range
        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("sum of array based on range :"+ sum1);

        System.out.println("Missing Number is : "+ (sum1 - sum));
    }
}
