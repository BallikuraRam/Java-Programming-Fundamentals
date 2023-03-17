package com.map_reduce;

import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("coreJava", "Spring", "hibernate", "Advanced Stream API");

        // find the length of the string
        String logestString = stringList
                .stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println("logestString ...:  " + logestString);


    }


}
