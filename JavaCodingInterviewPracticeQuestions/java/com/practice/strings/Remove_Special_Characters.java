package com.practice.strings;

public class Remove_Special_Characters {
    public static void main(String[] args) {
        String s = "Ram @#$%^ 984845 *^*";
         s = s.replaceAll("[^a-zA-Z0-9]" , "");
        System.out.println(s);
    }
}
