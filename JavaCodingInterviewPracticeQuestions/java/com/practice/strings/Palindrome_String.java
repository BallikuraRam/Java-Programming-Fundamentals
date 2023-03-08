package com.practice.strings;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string : ");
        String str = scanner.nextLine();
        String org_str = str ;

        String rev = "";
        int len = str.length();
        for (int i = len -1 ; i >=0 ; i-- )
        {
            rev = rev + str.charAt(i);
        }
        if (org_str==(rev) && org_str.equals(rev))
        {
            System.out.println(rev+"  : is palindrome string  ");
        }
        else {
            System.out.println(rev +"   : is not palindrome string ");
        }
    }
}
