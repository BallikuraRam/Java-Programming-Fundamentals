package joggedArray;

public class SumofElements {
    public static void main(String[] args) {
        int num [][] = {{1 , 2, 3} , {1 , 2, 3,} , {3 , 2, 1}};
        int sum = 0 ;

        for (int i = 0 ; i < num.length ; i++)
        {
            for (int j = 0 ; j< num[i].length ; j++)
            {
                sum += num[i][j];
            }
        }
        System.out.println("Sum of : "+  sum);
    }
}
