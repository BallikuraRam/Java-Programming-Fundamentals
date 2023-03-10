package com.collection.naturalSortingCustomObjects.comparator;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.customer_name.compareTo(o2.customer_name);
    }
}
