package com.developer;

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // using StringBuilder Class Object
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);
        System.out.println("Original String : "+str);
        System.out.println("Reverse String  : "+ stringBuilder.reverse());

        // using for loop
        char [] chars = str.toCharArray();
        int leng = chars.length;
        for (int i = 0 ; i < leng / 2 ; i++)
        {
            char temp = chars[i];
            chars[i] = chars[leng-i-1];
            chars[leng-i-1] =temp;
        }
        String reversed = new String(chars);
        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+reversed);
    }
}
