package com.developer;

import java.util.Scanner;

public class Compare_two_Strings_based_on_Same_Chars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String 1 :  ");
        String str3 = scanner.nextLine();
        System.out.println("String 2 :  ");
        String str4 = scanner.nextLine();
        String str5 = main(str3 ,str4);
        System.out.println("your final result : "+ str5);
    }

    public static String main(String str1 , String str2) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < str1.length() ; i++)
        {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1)
            {
                stringBuilder.append(ch);
            }else {
                stringBuilder.append("+");
            }
        }
        return stringBuilder.toString();
    }
}
