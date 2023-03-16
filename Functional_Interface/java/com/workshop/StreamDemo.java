package com.workshop;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // get the customer information from collection object
        List<Customer> customerList = CustomerUtils.getCustomerData();

        // converting the collection object into stream object
        Stream<Customer> customerStream = customerList.stream();

        // Wanted to display customer information as object by object
        //forEach() is terminal operation
        //Consumer is an Functional Interface which is taking customer object and displaying customer object
        //passing consumer object to forEach method will execute for every customer in last object
        Consumer<Customer> customerConsumer = customer -> System.out.println(customer);
        customerList.forEach(customerConsumer);

//        calling forEach method on customerStream
        customerStream.forEach(customerConsumer);

        // getting all the customer names for the List of customers
        //map() is an intermediate operation which is used to perform the required property(customerName, id) from object
        Stream<String> customerLocation = customerStream.map(customer -> customer.getLocation());

        //displaying the customerLocations
        customerLocation.forEach(cust -> System.out.println(cust));

        //wanted to get all customer information who are location hyd
        //to achieve this task we nned to go for intermediate operation filter()
        // filter() is taking Predicate Functional interface as parameter which can be used for conditional evaluation
        Predicate<Customer> hydPredicate = customer -> customer.getLocation().equalsIgnoreCase("Hyd");

        customerStream.filter(hydPredicate).forEach(customerConsumer);
    }
}
