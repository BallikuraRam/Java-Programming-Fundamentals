package com.developer;

import java.util.Scanner;

public class Reverse_of_each_Word {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Word  :  ");
        String original = scanner.nextLine();
        String[] words = original.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]);
            reversed = reversed.reverse();
            words[i] = reversed.toString();
        }
        String reversed = String.join(" ", words);
        System.out.println("Original string: '" + original + "'");
        System.out.println("Reversed words: '" + reversed + "'");
    }
}
