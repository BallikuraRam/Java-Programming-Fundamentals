package com.developer;

public class MyClass {

    public static void main(String[] args) {

        //sum of two numbers
        CalculateTwoNumbers sn = (int a, int b) -> {
            // sum logic
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };
        sn.twoNumbers(12, 15);

        CalculateTwoNumbers calculateTwoNumbers = (int a, int b) -> {
            int mul = a * b;
            System.out.println(mul);
            return a * b;
        };
        calculateTwoNumbers.twoNumbers(2, 5);
    }
}
