package com.practice.strings;

public class Count_Character_Occurrence {
    public static void main(String[] args) {
        String str = "Java is Programming Language";
        // total length
        int total_count = str.length();

        // total length after remove a particular character
        int total_count_after_remove = str.replace("m", "").length();

        int count = total_count - total_count_after_remove;
        System.out.println(count);

    }
}
