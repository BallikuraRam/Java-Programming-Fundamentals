package com.developer;

import java.util.Scanner;

public class Palindrome_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String s = scanner.nextLine();

        if (isPalindrome(s))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome ");
        }
    }
    public static boolean isPalindrome(String str) {
        int len = str.length();

        for (int i = 0 ; i < len/2;i++)
        {
            if (str.charAt(i) != str.charAt(len-i-1))
            {
                return false ;
            }
        }
        return true;
    }

}
