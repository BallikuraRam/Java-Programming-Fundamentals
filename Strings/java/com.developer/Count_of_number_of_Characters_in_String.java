package com.developer;

import java.util.Scanner;

public class Count_of_number_of_Characters_in_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String st = scanner.nextLine();

        System.out.println("your character count is : " + st.length());
    }
}
