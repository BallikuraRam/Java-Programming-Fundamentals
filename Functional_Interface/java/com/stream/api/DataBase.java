package com.stream.api;

import java.util.ArrayList;
import java.util.List;

//DAO layer
public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ashok", "IT", 25000));
        list.add(new Employee(2, "Suresh", "HR", 50000));
        list.add(new Employee(3, "Rahul", "BA", 20000));
        list.add(new Employee(4, "Prasanta", "HR", 5000));
        list.add(new Employee(5, "Ram", "SE", 50000));

        return list;
    }
}
