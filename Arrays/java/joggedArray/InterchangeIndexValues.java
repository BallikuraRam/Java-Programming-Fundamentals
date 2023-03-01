package joggedArray;

public class InterchangeIndexValues {

    public static void main(String[] args) {
        int arr1[][] = {{1, 2}, {3, 4}};

        System.out.println("Fisrt Array : ");
        printArr(arr1);

        int[][] transposed = transposedArr(arr1);

        System.out.println("Transposed Array : ");
        printArr(transposed);
    }

    public static int[][] transposedArr(int[][] array) {
        int[][] transpoed = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpoed[j][i] = array[i][j];
            }
        }
        return transpoed;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
