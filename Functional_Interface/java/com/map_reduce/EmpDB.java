package com.map_reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDB {

    public static List<Emp> getAllEmp() {
        return Stream.of(new Emp(1, "Ram", "A", 25000),
                new Emp(2, "Sowji", "B", 35000),
                new Emp(3, "Naveen", "A", 30000),
                new Emp(3, "Naveen", "C", 20000),
                new Emp(3, "Naveen", "A", 50000)).collect(Collectors.toList());
    }
}
