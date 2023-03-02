package com.developer;

import java.util.Scanner;

public class Find_Maxi_Length_Word {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Word : ");
        String str1 = s.nextLine();
        String maxLengthWord = findMaxiLengthWord(str1);
        System.out.println("Your max length word is : "+ maxLengthWord);
    }

    public static String findMaxiLengthWord(String str) {
        String[] word = str.split("\\s+");
        String maxLength = word[0];

        for (String words : word) {
            if (words.length() > maxLength.length()) {
                maxLength = words;
            }
        }
        return maxLength;
    }
}
