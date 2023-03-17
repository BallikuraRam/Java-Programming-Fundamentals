package com.stream.sorting;

import com.stream.api.DataBase;
import com.stream.api.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_List_Using_Lambda {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

//        Collections.sort(list); //ASCENDING
        System.out.println("Ascending Order :" + list);
//
//        Collections.reverse(list); //DESCENDING
        System.out.println("Descending order :" + list);
//
//        //descending order
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));

        List<Employee> list1 = DataBase.getEmployees();

        Collections.sort(list1, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));

        for (Object o : list1) {
            // print the list using advanced for loop
            System.out.println(o);
        }

        //using compare() to sort objects based on the sending order (pure Lambda Expression)
        list1
                .stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(System.out::println);

        // using comparing() method reference to sort the salary based on ascending order
        list1
                .stream()
                .sorted(Comparator.comparing(emp-> emp.getSalary()))
                .forEach(System.out::println);

        // using comparing() method reference to sort the name based on ascending order
        list1
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        list1
                .stream()
                .sorted(Comparator.comparing(Employee::getId))
                .forEach(System.out::println);

        list1
                .stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .forEach(System.out::println);
    }
}

