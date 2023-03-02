package com.developer;

import java.util.Scanner;

public class Count_Characters {
    public static void main(String[] args) {
        countCharacters();
    }

    public static void countCharacters() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your word : ");
        String input = scanner.nextLine() ;
        int uppercase = 0 ;
        int lowercase = 0 ;
        int spericalCharacters = 0 ;
        int digits = 0 ;

        // loop through character in the input string
        for (int i = 0 ; i < input.length() ; i++)
        {
            char ch = input.charAt(i);
            // check the character is upperCase
            if (Character.isUpperCase(ch))
            {
                uppercase ++;
            }
            // check the character is lower case
            if (Character.isLowerCase(ch))
            {
                lowercase ++ ;
            }
            //check the character in digits
            if (Character.isDigit(ch))
            {
                digits ++ ;
            }

            // check if special character (not letter and digit)
            else if (!Character.isLetterOrDigit(ch)) {
                spericalCharacters ++ ;
            }
        }
        System.out.println("UpperCase Letters : "+uppercase);
        System.out.println("Lower Case Letter : "+lowercase);
        System.out.println("Special Characters : "+spericalCharacters);
        System.out.println("Digits : "+digits);
    }
}
