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
        Collections.sort(customerArrayList, new CustomerIdComparator());
        System.out.println("sorting based on id ");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }

        // based on String type
        Collections.sort(customerArrayList, new CustomerNameComparator());
        System.out.println("sorting based on name ");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }


        // anonymous implementation ascending order
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o1.customer_id - o2.customer_id);
            }
        });

        System.out.println("ascending order based on id ");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }
//
//        // anonymous implementation descending order
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
        System.out.println("descending order based on id ");
        for (Customer c : customerArrayList) {
            System.out.println(c);
        }


    }
}
