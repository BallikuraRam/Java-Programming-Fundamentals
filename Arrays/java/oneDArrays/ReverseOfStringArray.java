package oneDArrays;

import java.util.Arrays;

public class ReverseOfStringArray {
    public static void main(String[] args) {

        String array[] = {"ram" , "shiva"};

        String[] reverse = new String[array.length];

        for (int i = 0 ; i < array.length ; i++)
        {
            reverse[array.length - i - 1] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse));
    }
}
