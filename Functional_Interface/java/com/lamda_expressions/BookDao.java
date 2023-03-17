package com.lamda_expressions;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    // public method which returns list of Objects
    public List<Book> getAllBooks()
    {
        // object creation of ArrayList Class
        List<Book> bookList = new ArrayList<>();

        // add object to the ArrayList Class
        bookList.add(new Book(1,"Java",120));
        bookList.add(new Book(2,"Sql",55));
        bookList.add(new Book(3,"PHP",150));
        bookList.add(new Book(4,"HTML",75));
        bookList.add(new Book(5,"Spring Boot",550));

        // returning the arrayList object
        return bookList ;
    }

}
