package com.collection.naturalSortingCustomObjects.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// its interface which is used to sort multiple values in natural order
public class ComparatorExample {
    public static void main(String[] args) {

        List<Customer> customerArrayList = new ArrayList<>();
        customerArrayList.add(new Customer(101, "Ram", "@ram", 9848454747l));
        customerArrayList.add(new Customer(104, "Ramana", "@ramana", 9848454748l));
        customerArrayList.add(new Customer(103, "Ramesh", "@ramesh", 9848454740l));
        customerArrayList.add(new Customer(102, "Raju", "@raju", 9848454749l));

//        System.out.println(customerArrayList);

        // based int type
//        Collections.sort(customerArrayList ,new CustomerIdComparator());

        // based on String type
//        Collections.sort(customerArrayList , new CustomerNameComparator());

        // anonymous implementation ascending order
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o1.customer_id - o2.customer_id);
            }
        });

        System.out.println("ascending order");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }

        // anonymous implementation descending order
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.customer_id > o2.customer_id) {
                    return -1;
                } else if (o1.customer_id < o2.customer_id) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("descending order");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }


    }
}
