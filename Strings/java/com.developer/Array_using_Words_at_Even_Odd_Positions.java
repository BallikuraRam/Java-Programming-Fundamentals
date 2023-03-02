package com.developer;

public class Array_using_Words_at_Even_Odd_Positions {

    public static void main(String[] args) {
        String strings = "This is my String ";

        String[] evenWords = evenPositions(strings);
        System.out.println(evenWords);


    }

    public static String[] evenPositions(String str) {
        String[] words = str.split("\\s+");
        String[] evenWords = new String[words.length / 2];
        int index = 0;

        for (int i = 0; i < words.length; i += 2) {
            evenWords[index] = words[i];
            index++;
        }
        return evenWords;
    }
}
