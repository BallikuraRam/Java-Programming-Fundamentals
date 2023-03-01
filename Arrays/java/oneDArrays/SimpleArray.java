package oneDArrays;

public class SimpleArray {
    public static void main(String[] args) {

        // create an array
        int array[] = new int[5];

        // insert elements into array
        array[0] =  10 ;
        array[1] =  20 ;
        array[2] =  30 ;
        array[3] =  40 ;
        array[4] =  50 ;

        // print single element the form array
        System.out.println("single element : " + array[4]);

        // print all the elements using for loop
        for (int i =0 ; i < array.length; i++)
        {
            System.out.println(" print all elements Using for loop : "+ array[i]);
        }

        // print all the elements using while loop
        int i1 = 0 ;
        while (i1<array.length)
        {
            System.out.println("print all elements Using while loop : " +array[i1]);
            i1++;
        }

    }
}
