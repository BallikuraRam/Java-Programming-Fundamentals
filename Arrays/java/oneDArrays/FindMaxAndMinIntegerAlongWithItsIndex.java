package oneDArrays;

public class FindMaxAndMinIntegerAlongWithItsIndex {


    public static void main(String[] args) {


        int arr[] = {1 , 6, 32, 0, 5};
        int max = arr[0];
        int maxIdex = 0 ;

        // Maximum Value
        for (int i = 1 ; i <arr.length ; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxIdex = i;
            }
        }
        System.out.println("The maximum number of ana array is :"+max +" and its index is :"+maxIdex);

        // Minimum Value
        for (int i = 0 ; i <arr.length ; i++)
        {
            if (arr[i] < max)
            {
                max = arr[i];
                maxIdex = i;
            }
        }
        System.out.println("The minimum number of ana array is :"+max +" and its index is :"+maxIdex);
    }

}
