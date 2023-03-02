package com.developer;

import java.util.Scanner;

public class Find_Min_Length_Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Youe Word : ");
        String str1 = scanner.nextLine();
        String min = minLengthWord(str1);
        System.out.println("Your Entered word contains lowest word is : "  +min);
    }

    public static String minLengthWord(String str) {

        String[] words = str.split("\\s+");
        String minLength = words[0];

        for (String word : words) {
            if (word.length() < minLength.length()) {
                minLength = word;
            }
        }
        return minLength;
    }
}
