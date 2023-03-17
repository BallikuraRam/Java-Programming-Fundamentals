package com.lamda_expressions;

import java.util.Collections;
import java.util.List;

public class BookService {

    // anonymous function
    //(o1,o2) ->o2.getName().compareTo(o1.getName());

    //get All books sorted method return type is list of objects
    public List<Book> getAllSort() {

        // object creation of ArrayList class
        List<Book> bookList = new BookDao().getAllBooks();

        // sort the collection using Collections Class sort() method
        // and MyComparator class default constructor
        Collections.sort(bookList, (o1,o2) ->o2.getName().compareTo(o1.getName()));

        // return list of objects
        return bookList;
    }

    public static void main(String[] args) {

        // calling
        System.out.print(new BookService().getAllSort());
    }
}

//class MyComparator implements Comparator<Book> {
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o2.getId() - o1.getId();
//    }

