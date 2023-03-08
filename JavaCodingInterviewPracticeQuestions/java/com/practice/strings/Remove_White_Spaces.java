package com.practice.strings;

public class Remove_White_Spaces {
    public static void main(String[] args) {

        String str = "          Hello   Java   Hai How   Are You          ";
        str = str.replaceAll("\\s", ""); // remove white spaces in entire String
        System.out.println(str);


        String str1 = "          Hello   Java   Hai How   Are You          ";
        str1 = str1.trim(); // remove white spaces from starting and ending
        System.out.println(str1);
    }
}
