package com.collection.listInterface.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentArrayList {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(100 , "Ram" , 1));
        studentArrayList.add(new Student(101 , "Sowji" , 2));
        studentArrayList.add(new Student(102 , "Naveen" , 3));
        studentArrayList.add(new Student(103 , "Keerthi" , 4));
        studentArrayList.add(new Student(104 , "Samath" , 5));

        //forward direction
//        System.out.println("++++Forward Direction+++");
        for (Student student:studentArrayList)
        {
            System.out.println(student.toString());
        }

        // backward direction
        System.out.println("++++Backward Direction+++");
        for (int i = studentArrayList.size()-1 ; i>=0 ; i--)
        {
            System.out.println(studentArrayList.get(i));
        }

        // forward direction using ListIterator
        System.out.println("ListIterator Using Forward Direction");
        ListIterator<Student> listIterator = studentArrayList.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        // backward direction using ListIterator
        System.out.println("ListIterator Using Backward Direction");
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }

    }
}
