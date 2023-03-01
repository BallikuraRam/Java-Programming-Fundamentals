package joggedArray;

public class CommonElementsIntegers {

    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = {{0, 1, 2}, {12, 5, 7}, {9, 90, 98}};

        System.out.println("Fisrt Array : ");
        printArray(arr1);

        System.out.println("Second Array :n ");
        printArray(arr2);

        System.out.println("Common Elements : ");
        commonElements(arr1 , arr2);
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void commonElements(int[][] arr1, int arr2[][]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int element = arr1[i][j];

                for (int m = 0; m < arr2.length; m++) {
                    for (int n = 0; n < arr2[m].length; n++) {
                        if (arr2[m][n] == element) {
                            System.out.print(element + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
