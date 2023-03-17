package com.predefine.fun_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    //    @Override
//    public boolean test(Integer integer) {
//        if (integer % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    public static void main(String[] args) {

        // Predate<Integer> Interface
        //Returns: true if the input argument matches the predicate, otherwise false

        Predicate<Integer> predicate = t -> t % 2 == 0;

        //calling test() and pass the argument

        System.out.println(predicate.test(8));

        // create List
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // using stream method and filter method take argument as predicate reference
        // take one terminal operator to print the intermediate operator
        list.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.println("Print even : "+t));
    }
}