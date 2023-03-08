package com.practice.loops;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number :");

        int num = scanner.nextInt();

        int org_num = num;

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (rev == num) {
            System.out.println(org_num + " palindrome Number ");
        } else {
            System.out.println(org_num + " not palindrome Number ");
        }
    }
}
