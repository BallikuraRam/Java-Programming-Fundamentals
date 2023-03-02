package com.developer;

import java.util.Scanner;

public class Remove_all_Starting_Ending_Spaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your String : ");
        String str = scanner.nextLine();

        String trimmed = str.trim();

//        System.out.println("enter your String :");
        System.out.println("Remove All leading and trailing white spaces   :  " + trimmed);
    }
}
