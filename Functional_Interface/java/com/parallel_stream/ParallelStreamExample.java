package com.parallel_stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        long start = 0 ;
        long end =0 ;

//        start = System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("plain Stream time  **********");
//        System.out.println(end-start);
//
//        System.out.println("***************");
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end = System.currentTimeMillis();
//        System.out.println("Parallel time ");
//        System.out.println(end-start);

        IntStream.range(1,100).forEach(x->{
            System.out.println("Thread : "+Thread.currentThread()+" :  "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread "+Thread.currentThread()+" :  "+x);
        });
    }
}
