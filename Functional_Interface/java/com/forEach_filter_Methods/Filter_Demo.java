package com.forEach_filter_Methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//filter() is used check the condition
public class Filter_Demo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "amena", "Mouni", "Arun", "Itiyaz", "Anjali", "Hindu");

        for (String l : list) {
            if (l.startsWith("A")) {
                //System.out.println(l);
            }
        }

        // covert to stream() to conditional check taking filter() and print the result taking the forEach().
        // filter() is Intermediate operator & forEach() is Terminal operator.
        list.stream().filter(t -> t.startsWith("a")).forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ram");
        map.put(2, "Sowji");
        map.put(3, "Naveen");
        map.put(4, "Prasanth");

        //anonymous function
        map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(t -> System.out.println(t));

        
    }
}
