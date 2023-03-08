package com.practice.loops;

// 5! = 5 * 4 * 3 * 2 * 1 = 120 descending
public class Factorial_Number {

    public static void main(String[] args) {
        int num = 5;
        long fact = 1;

        // 5! = 1 * 2 *  3 * 4 * 5 = 120 ascending
        for (int i = 1; i <= num; i++) // 1 2 6 24 120
        {
            fact = fact * i;
        }
        System.out.println(fact);

        // 5! = 5 * 4 * 3 * 2 * 1 = 120 descending
        for (int i = num; i >= 1; i--) // 5 20 60 120 120
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
