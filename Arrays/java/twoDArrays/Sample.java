package twoDArrays;

public class Sample {
    public static void main(String[] args) {

        // declare an array
        int array[][] = new int[3][2];

        // initialize a values
        array[0][0] = 1;
        array[0][1] = 2;

        array[1][0] = 3;
        array[1][1] = 4;

        array[2][0] = 5;
        array[2][1] = 6;

        // one type
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // another type
        int size = 0;
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int j1 = 0; j1 < array[i1].length; j1++) {
                System.out.print(array[i1][j1] + " ");
            }
            System.out.println();
        }
        // using for each loop

        int sum1 = 0;
        int noOfElements = 0;
        for (int[] singleDimArray : array) {
            for (int value : singleDimArray) {
                sum1 += value;
                noOfElements++;
            }
            System.out.println();

        }
        System.out.println(sum1);
        System.out.println(sum1 / noOfElements);
    }
}
