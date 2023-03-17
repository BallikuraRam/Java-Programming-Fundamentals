package com.optional;

import com.map_flapmap.Customer;
import com.map_flapmap.ECartDatabase;

import java.util.List;

public class Custom_Object_Demo {

    public static void main(String[] args) throws Exception {
        System.out.println(getCustomerByEmail(""));
    }

    // this method return list of email
    public static Customer getCustomerByEmail(String email) throws Exception {
        List<Customer> customerList = ECartDatabase.getAllCustomer();

        return customerList.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny()
                .orElseThrow(()->new Exception("no value present at this email .........."));
    }
}
