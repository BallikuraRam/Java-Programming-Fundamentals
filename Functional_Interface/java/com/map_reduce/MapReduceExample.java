package com.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // old approach
        int sum = 0;
        for (int i : list) {
            sum = sum + i;
        }
        System.out.println(sum);

        //mapToInt() ->
        // Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
        int sum1 = list.stream().mapToInt(integer -> integer).sum();
        System.out.println("using stream :" + sum1);

        // reduce() ->
        //Sum, min, max, average, and string concatenation are all special cases of reduction.
        // Summing a stream of numbers can be expressed as:
        // Integer sum = integers.reduce(0, (a, b) -> a+b);
        Integer reduceSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        // reduce() ->
        //Sum, min, max, average, and string concatenation are all special cases of reduction.
        // Summing a stream of numbers can be expressed as:
        // Integer sum = integers.reduce(0, Integer::sum);
        Optional<Integer> reduceSumWithMethodReference = list.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());


    }
}
