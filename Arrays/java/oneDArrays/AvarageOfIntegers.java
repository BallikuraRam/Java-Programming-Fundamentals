package oneDArrays;

public class AvarageOfIntegers {

    public static void main(String[] args) {
        int array[] = {2,5,3,9,6};
        int n = array.length;

        int total =0;

        for(int i = 0 ; i<n ; i++)
        {
            total += array[i];
        }

        double average = (double) total / n;
        System.out.println("sum of array : "+total);
        System.out.println("average of an integer array : "+average);
    }

}
