package com.practice.strings;

import java.util.Random;

public class Generate_Random_Numbers_and_Strings {
    public static void main(String[] args) {

        // approach 1 Random class
        Random rand = new Random();

        int random_int = rand.nextInt(10);
        System.out.println(random_int);

        // Approach 2 Math class
        System.out.println(Math.random());
        System.out.println(Math.addExact(1 , 2));

    }
}
