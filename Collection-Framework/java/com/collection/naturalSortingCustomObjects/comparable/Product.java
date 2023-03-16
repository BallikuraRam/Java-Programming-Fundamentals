package com.collection.naturalSortingCustomObjects.comparable;

public class Product implements Comparable<Product> {

    int product_id;
    String productName;
    long rating ;

    double customer_rating;

    public Product(int product_id, String productName, long rating, double customer_rating) {
        this.product_id = product_id;
        this.productName = productName;
        this.rating = rating;
        this.customer_rating = customer_rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", productName='" + productName + '\'' +
                ", rating=" + rating +
                ", customer_rating=" + customer_rating +
                '}';
    }

    // we can sort only one type of value only at a time
    @Override
    public int compareTo(Product o) {
//         based on String type
//        return this.productName.compareTo(o.productName);

        // based on int type
//        return this.product_id-o.product_id;

        // based on long type
//        return (int) (this.rating - o.rating);

//        // based on double
        return (int) (this.customer_rating - o.customer_rating);
    }


}
