package com.practice.loops;

import java.util.Scanner;

public class Largest_no_of_3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number :");
        int b = scanner.nextInt();

        System.out.println("Enter Third Number :");
        int c = scanner.nextInt();

        // approach1 - Logical operators
        if (a > b && a > c) {
            System.out.println(a + "  a  : is Largest ");
        } else if (b > c && b > a) {
            System.out.println(b + " b : is Largest");
        } else {
            System.out.println(c + " c : is Largest");
        }

        // Ternary Operator
        //approach 1
        int largest = a > b ? a : b;
        int largest1 = c > largest ? c : largest;
        System.out.println(largest1);

        // approach 2
        int largest2 = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(largest2);
    }
}
