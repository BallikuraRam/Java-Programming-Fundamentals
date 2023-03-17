package com.map_flapmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ECartDatabase {

    public static List<Customer> getAllCustomer() {
        return Stream.of(new Customer(101, "Ram", "Ram@gmail.com", Arrays.asList("98484557474", "9912500469")),
                new Customer(102, "Sowjanya", "Sowji@gmail.com", Arrays.asList("9133443333", "9121712833")),
                new Customer(103, "Srikanth", "Sri@gmail.com", Arrays.asList("98798798989", "8787987990")),
                new Customer(104, "Naveen", "Naveen@gmail.com", Arrays.asList("908978889", "9089877678")))
                .collect(Collectors.toList());
    }
}
