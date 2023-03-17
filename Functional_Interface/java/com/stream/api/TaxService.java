package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input) {

        return (input.equalsIgnoreCase("tax")) ? DataBase.getEmployees().stream().filter(employee -> employee.getSalary() > 50000).collect(Collectors.toList()) : DataBase.getEmployees().stream().filter(employee -> employee.getSalary() < 50000).collect(Collectors.toList());

    }

    public static List<Employee> containingHRDept() {
        return DataBase.getEmployees().stream().filter(employee -> employee.getDept().equalsIgnoreCase("HR")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.print(evaluateTaxUsers("non tax"));

        System.out.println(" ");

        System.out.println(containingHRDept());
    }
}
