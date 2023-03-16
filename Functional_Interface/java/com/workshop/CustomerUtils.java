package com.workshop;

import java.util.Arrays;
import java.util.List;

public class CustomerUtils {

    //populating the static data for the customers
    public static List<Customer> getCustomerData() {

        // creating the address class object
        Address homeAddress = new Address("1-2-1", "Abc street", "Hyderabad");
        Address officeAddress = new Address("1-2-2", "xyz street", "Telangana");

        // creating the customer class objects
        Customer customer1 = new Customer(1, "hyd", "R123@gmail.com", "988987987", Arrays.asList(homeAddress, officeAddress));
        Customer customer2 = new Customer(2, "Telangana", "ram@123", "9878979869", Arrays.asList(homeAddress, officeAddress));
        Customer customer3 = new Customer(3, "Chennai", "chennai@gmail.com", "9870987089", Arrays.asList(homeAddress, officeAddress));
        Customer customer4 = new Customer(4, "Pune", "R123@gmail.com", "988987987", Arrays.asList(homeAddress, officeAddress));
        Customer customer5 = new Customer(5, "Mumbai", "ram@123", "9878979869", Arrays.asList(homeAddress, officeAddress));
        Customer customer6 = new Customer(6, "chennai", "chennai@gmail.com", "9870987089", Arrays.asList(homeAddress, officeAddress));

        // return list of objects
        return Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6);
    }
}
