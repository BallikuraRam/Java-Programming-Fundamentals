package com.practice.loops;

import java.util.Scanner;

public class Count_no_of_digits_in_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        while (num > 0)
        {
            num = num / 10 ;
            count ++;
        }
        System.out.println(count);
    }
}
