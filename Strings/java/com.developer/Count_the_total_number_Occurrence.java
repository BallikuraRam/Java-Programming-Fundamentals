package com.developer;

import java.util.Scanner;

public class Count_the_total_number_Occurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Word here : ");
        String str = scanner.nextLine();

        String word = "l";
        System.out.println("its your asking count in your  " +word+ " text : "+occurrence(str, word));
    }
    public static int occurrence(String str, String word) {
        String a[] = str.split("");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }
        return count;
    }
}
