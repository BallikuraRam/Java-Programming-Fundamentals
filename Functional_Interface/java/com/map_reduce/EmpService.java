package com.map_reduce;

public class EmpService {
    public static void main(String[] args) {

        // get employee whose grade A
        //get salary
        double avgSalary = EmpDB.getAllEmp().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.println(avgSalary);

        // get employee whose grade A
        // get salary and count
        Double count = (double) EmpDB.getAllEmp().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i->i)
                .count();
        System.out.println(count);

        // get sum whose sal is A
        double sum = EmpDB.getAllEmp().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println(sum);
    }

}
