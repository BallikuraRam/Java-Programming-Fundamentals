package oneDArrays;

public class SumOfIntegers {

    public static void main(String[] args) {

        int array[] = {2, 5, 1, 9, 6};
        int sum = 0;

        // one way
        int sum1 = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println("Direct way : "+sum1);

        // using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("using for loop : The sum of array is :" + sum);

        // using foreach
        for (int value : array) {
            sum += value;
        }
        System.out.println("Using for each loop : ");
        System.out.println("sum :"+ sum);
        System.out.println("average : "+ sum / array.length);
    }
}
