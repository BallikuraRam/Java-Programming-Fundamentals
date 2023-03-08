package com.practice.loops;

public class Count_no_of_Even_and_Odd_Numbers {
    public static void main(String[] args) {
        int num = 1212;

        int even_count = 0;
        int odd_Count = 0;

        while (num > 0)  // 1212 121 12 1
        {
            int rem = num % 10; // 2 1 2 1
            if (rem % 2 == 0) {
                even_count++; // 1 + 1
            } else {
                odd_Count++;// 1 + 1
            }
            num = num / 10; // 121 12  1
        }
        System.out.println("even Count : " + even_count);
        System.out.println("Odd count : " + odd_Count);
    }
}
