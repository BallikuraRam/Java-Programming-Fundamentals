package com.developer;

import java.util.Scanner;

public class Count_of_number_of_Words_in_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your word : ");
        String s1 = scanner.nextLine();

        char c[] = new char[s1.length()];
        int count = 0;

        for (int i = 0; i < (s1.length() - 1); i++) {
            if ((i > 0) && (s1.charAt(i) != ' ') && (s1.charAt(i - 1) == ' ') || ((s1.charAt(i) != ' ') && (i == 0))) {
                count++;
            }
        }
        System.out.println(count);

    }
}
