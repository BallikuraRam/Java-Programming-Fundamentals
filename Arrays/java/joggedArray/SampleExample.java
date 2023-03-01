package joggedArray;

public class SampleExample {

    public static void main(String[] args) {

//        int jogged[][] = new int[3][];
//        jogged[0] = new int[2];
//        jogged[1] = new int[5];
//        jogged[2] = new int[3];
//
//        jogged[0][0] = 1;
//        jogged[0][1] = 2;
//
//        jogged[1][0] = 1;
//        jogged[1][1] = 2;
//        jogged[1][2] = 1;
//        jogged[1][3] = 2;
//        jogged[1][4] = 1;
//
//        jogged[2][0] = 1;
//        jogged[2][1] = 2;
//        jogged[2][2] = 1;
        int jogged[][] = {{1, 2} , {1 , 2, 1 } , {1 , 2,1 , 1}};

        // print all the elements
        for (int i = 0 ; i < jogged.length ; i++)
        {
            for (int j = 0 ; j<jogged[i].length ; j++)
            {
                System.out.print(jogged[i][j]+" ");
            }
            System.out.println();
        }

    }
}
