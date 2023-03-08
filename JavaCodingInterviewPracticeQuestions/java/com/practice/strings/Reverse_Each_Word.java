package com.practice.strings;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        // original string
        String str = "Welcome To Java";
        System.out.println("Original String " + str);

        // split the string and store the array
        String[] word = str.split(" ");

        String reverseString = "";

        for (String w : word) // welcome
        {
            String reverseWord = "";
            for (int i = w.length() - 1; i >= 0; i--) // welcome
            {
                reverseWord = reverseWord + w.charAt(i);
            }
            System.out.println("Reversed Word " + reverseWord);

            reverseString = reverseString + reverseWord + " "; // emoclew
        }
        System.out.println("finally Reversed String :" + reverseString);

    }
}
