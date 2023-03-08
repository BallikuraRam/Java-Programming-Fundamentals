package com.practice.loops;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your number : ");
        int num = scanner.nextInt();

        // logic 1 using Algorithm
        int rev = 0 ;
        while (num != 0)
        {
            rev = rev * 10 + num % 10 ;
            // 0 * 10 + 1234 % 10 = remain 4 -> 40 + 3 = 43 -> 430 + 2 = 432 -> 4321

            num = num / 10 ;
            // 1234/10 = 123 -> 123/10 = 12 -> 12/10 = 1 -> 1/10 =0
        }
        System.out.println("Reverse Number : "+rev);

        // Using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev2 = sb.reverse();

        System.out.println("Reverse Number is : "+rev2);

        // using StringBuilder class
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev1 = sb1.reverse();

        System.out.println("Reverse Word is : "+ rev1);
    }
}
