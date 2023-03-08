package com.practice.strings;

public class Reverse_Entire_String {

    public static void main(String[] args) {
        String  str = "ABCD";
        String rev = "";


        //1. using + (String Concatenation) operator
        int len = str.length(); //4

        for (int i= len - 1 ; i>=0 ; i--) // 3 2 1 0
        {
            rev = rev + str.charAt(i); // D C B A
        }
        System.out.println("Reverse A String : " + rev );

        //2. Using character Array
        char a[] = str.toCharArray();
        int length = a.length; // 4
        // index position 3 , 2 , 1 , 0 ,-1 false the loop exist the loop
        for (int  i = length -1 ; i>=0 ; i--)  // 3 , 2, 1 , 0 , -1
        {
            rev = rev + a[i]; // D C B A
        }
        System.out.println("Reverse Word is : "+rev);

        //3. StringBuffer class
        StringBuffer stringBuffer = new StringBuffer(str);
        //direct method
        System.out.println(stringBuffer.reverse());
    }
}
