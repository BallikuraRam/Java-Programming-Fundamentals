package com.predefine.fun_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;


// Supplier<String> interface is used to don't take any input but return as Type generic
// below example type generic is String
public class SupplierDemo {

//    @Override
//    public String get() {
//        return "Hi Everyone ....! ";
//    }

    public static void main(String[] args) {

        // take object of Supplier<T> interface return the Type Generic
//        Supplier<String> supplier = ()-> "Hi Everyone ....! ";// Lambda Expression

//        String s = supplier.get();
//        System.out.println(s);

        //declare and initialise arrayList
        List<String> list = Arrays.asList("a","b");

        System.out.println(list.stream().findAny().orElseGet(()-> "Hi Everyone ....! "));
    }
}
