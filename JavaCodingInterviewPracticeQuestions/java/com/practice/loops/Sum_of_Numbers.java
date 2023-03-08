package com.practice.loops;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        int num = 12345;
         int sum = 0 ;

         while (num > 0)
         {
             sum = sum +num % 10 ;
             num = num / 10 ;
         }
        System.out.println("The sume of numbers is :"+ sum);

//        if (sum %2 == 0)
//        {
//            System.out.println("sum is divisible by 2 so it is :  ");
//            System.out.println(sum+" Even Number");
//        }
//        else {
//            System.out.println("sum is not  divisible by 2 so it is :");
//            System.out.println(sum+ " Odd Number ");
//        }
    }
}
