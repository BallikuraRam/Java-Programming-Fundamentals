package com.map_flapmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customerList = ECartDatabase.getAllCustomer();

        // List<Customer> convert list<String> -> Data Transformation
        // mapping : customer -> customer.getEmail() >>  one to one mapping
        List<String> emails = customerList
                .stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());

        System.out.println(emails);

        // mapping : customer -> customer.getPhoneNumber() >> one to many mapping
        List<List<String>> phoneNumber = customerList
                .stream()
                .map(customer -> customer.getPhoneNumber())
                .collect(Collectors.toList());

        System.out.println(phoneNumber);

        // List<Customer> convert list<String> -> Data Transformation
        //mapping : customer -> customer.getPhoneNumber().stream() >> one to many mapping
        List<String> phones = customerList
                .stream()
                .flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());

        System.out.println(phones);
    }
}
