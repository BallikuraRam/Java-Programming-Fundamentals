package joggedArray;

public class SqauresOfArray {

    public static void main(String[] args) {
        int array[][] = {{1, 2}, {3, 4}, {5, 6}};

        int square[][] = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
//                square[i][j] = array[i][j] - array[i][j]  Subtraction
//                square[i][j] = array[i][j] + array[i][j];  Addition
//                square[i][j] = array[i][j] /  array[i][j]; //Division

                square[i][j] = array[i][j] * array[i][j]; // multiplication
            }
        }
        System.out.println("Original array ");
        printArray(array);

        System.out.println("Sqaure Array");
        printArray(square);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
