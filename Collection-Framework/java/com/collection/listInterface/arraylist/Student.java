package com.collection.listInterface.arraylist;

public class Student implements Comparable<Student> {

    int id ;
    String name ;

    int rank ;

    public Student(int id, String name , int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // sort based on rank (rank is int type)
//        return this.rank - o.rank;

        //sort based on name (name is String type )
//        return this.name.compareTo(o.name);

        // sort based on id (id is int type)
        return this.id - o.id;
    }
}
