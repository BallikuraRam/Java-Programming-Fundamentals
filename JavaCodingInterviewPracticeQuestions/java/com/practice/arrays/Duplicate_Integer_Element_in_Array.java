package com.practice.arrays;

public class Duplicate_Integer_Element_in_Array {
    public static void main(String[] args) {
        int a[] = {10 , 20 , 30 , 40 , 50};

        boolean status = false ;
        for (int i = 0 ; i < a.length ; i++)
        {
            for (int j = i + 1 ; j < a.length ; j++)
            {
                if (a[i] == a[j])
                {
                    System.out.println("found duplicate :"+ a[i]);
                    status = true ;
                }
            }
        }
        if (status == false)
        {
            System.out.println("not found any duplicates ");
        }
    }
}
