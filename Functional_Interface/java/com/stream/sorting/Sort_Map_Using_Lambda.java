package com.stream.sorting;

import com.stream.api.Employee;

import java.util.*;

public class Sort_Map_Using_Lambda {

    public static void main(String[] args) {

        //declare the map
        Map<Integer, String> map = new HashMap<>();

        // adding key - value pairs in that map object
        map.put(1, "ram");
        map.put(3, "siva");
        map.put(4, "prasanth");
        map.put(2, "naveen");

        // print the map
        System.out.println(map);

        // Declare a List and take Type Generic is Map pass the argument as map.entrySet() method
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

        // using Collection Class take as list object and
        // anonymous function of Comparator Interface and CompareTo()
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        // iterate this map Entry
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //using the advanced
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("*********");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        //declare map take Key as UserDefined Object
        Map<Employee, Integer> map1 = new TreeMap<>((o1, o2) -> (int) ((int) o2.getSalary() - o1.getSalary()));

        // add some values
        map1.put(new Employee(1, "ram", "IT", 60000), 1);
        map1.put(new Employee(3, "ashok", "HR", 90000), 3);
        map1.put(new Employee(2, "siva", "BA", 80000), 2);
        map1.put(new Employee(4, "naveen", "SE", 120000), 5);
        map1.put(new Employee(5, "prasanth", "TE", 150000), 4);

//        System.out.print(map1);

        //ascending order based on salary
        map1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);

        System.out.println("************");

        // descending order based on salary
        map1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);

    }
}
