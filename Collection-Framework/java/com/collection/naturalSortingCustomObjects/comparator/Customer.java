package com.collection.naturalSortingCustomObjects.comparator;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Customer implements Comparator<Customer> {

    int customer_id;
    String customer_name;
    String customer_mail;
    Long contact;

    public Customer(int customer_id, String customer_name, String customer_mail, Long contact) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_mail = customer_mail;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_mail='" + customer_mail + '\'' +
                ", contact=" + contact +
                '}';
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.customer_id - o2.customer_id;
    }

    @Override
    public Comparator<Customer> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Customer> thenComparing(Comparator<? super Customer> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Customer> thenComparing(Function<? super Customer, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingInt(ToIntFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingLong(ToLongFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Customer> thenComparingDouble(ToDoubleFunction<? super Customer> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
