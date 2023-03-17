package com.forEach_filter_Methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach_Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("R");
        list.add("A");
        list.add("M");
        list.add("U");

        // print the list using advanced for loop
        for (String s:list)
        {
//            System.out.println(s);
        }

        // convert stream() and user forEach() to print the
        list.stream().forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"R");
        map.put(2,"A");
        map.put(3,"M");

        map.forEach((key,value)->System.out.println(key+" : "+value));

        map.entrySet().stream().forEach(obj ->System.out.println(obj));

    }
}
