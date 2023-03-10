package com.collection.mapInterface;

import com.collection.listInterface.arraylist.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapDemo {

    public static void main(String[] args) {
        Student student = new Student(101 , "A" , 1);
        Student student1 = new Student(102 , "B" , 2);

        Map<Integer , Student> map = new HashMap<Integer,Student>();
        map.put(1 , student);
        map.put(2,student1);

        System.out.println(map);

        System.out.println(map.containsKey(4));

        //using keySet
        Set<Integer> set  =map.keySet();
        for (int s:set)
        {
            System.out.println(map.get(s));
        }

        // using entrySet
        Set<Map.Entry<Integer , Student>> entries = map.entrySet();
        for (Map.Entry<Integer , Student> i:entries)
        {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
            
    }
}
