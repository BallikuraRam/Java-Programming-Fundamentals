package com.optional;

import com.map_flapmap.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Customer customer = new Customer(101, "Ram", null, Arrays.asList("9848455474", "9121712833"));

        // empty() -> is empty or not
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        // of() -> pass the null argument variable check that
        // if it is null then Throws NullPointerException
        // email is null
        //Optional<String> email = Optional.of(customer.getEmail());
        //System.out.println(email);

        // ofNullable ->
        // return : an Optional with a present value if the specified value is non-null, otherwise an empty Optional
        Optional<String> email1 = Optional.ofNullable(customer.getEmail());
//        System.out.println(email1);

        //orElse() ->
        //return : the value, if present, otherwise the result produced by the supplying function
//        System.out.println(email1.orElse("default@gmail.cim........."));

        //orElseThrow() ->
        //return : If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
//        System.out.println(email1.orElseThrow(()-> new IllegalArgumentException("email is not present .....")));

        //orElseGet() ->
        //Returns : the value, if present, otherwise the result produced by the supplying function
        System.out.println(email1.map(String::toUpperCase).orElseGet(() -> "default email......."));


    }

}
