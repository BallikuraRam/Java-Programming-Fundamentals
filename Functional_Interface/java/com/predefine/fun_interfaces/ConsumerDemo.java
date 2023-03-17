package com.predefine.fun_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        //Consumer<T> interface type generic is Integer Value
        // Represents an operation that accepts a single input argument and returns no result.
        // Unlike most other
        //functional interfaces, Consumer is expected to operate via side effects.

        Consumer<Integer> integerConsumer = (t) -> System.out.println("Print :" + t);

        // calling accept() method and passing the Integer Value
        integerConsumer.accept(10);

        System.out.println(" ");


        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.forEach((t) -> System.out.println("Print :" + t));
    }
}
