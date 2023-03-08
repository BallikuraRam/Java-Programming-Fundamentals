package com.practice.strings;

public class Count_Words_in_String {
    public static void main(String[] args) {
        String str = "            Welcome        to        java         world            ";
        int count = 1;

        System.out.println("Original String :");
        System.out.println(str);

//        str = str.trim();
//        System.out.println("After Remove White spaces from starting and ending ");
//        System.out.println(str);
//
//        str = str.replaceAll("\\s", "");
//        System.out.println("After Remove white spaces in String ");
//        System.out.println(str);
//
//        str = str.replaceAll("a", "");
//        System.out.println("after remove a particular character ");
//        System.out.println(str);

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Count the  number of Words : ");
        System.out.println(count);
    }
}
