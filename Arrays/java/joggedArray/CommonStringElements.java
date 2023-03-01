package joggedArray;

public class CommonStringElements {

    public static void main(String[] args) {
        String string1[][] = {{"r", "a", "m"}, {"m", "o", "u", "n", "i"}};
        String string2[][] = {{"s", "o", "w", "j", "i"}, {"s", "r", "a", "v", "a", "n", "i"}};

        System.out.println("First array :");
        printArr(string1);

        System.out.println("Second Array : ");
        printArr(string2);

        System.out.println("Common Words in two Arrays : ");
        commonString(string1,string2);

    }

    public static void commonString(String[][] word1 , String[][] word2) {
        for (int i = 0 ; i < word1.length; i++)
        {
            for (int j = 0 ; j < word1[i].length ; j++)
            {
                String element = word1[i][j];
                for (int m = 0 ; m < word1.length ; m++)
                {
                    for (int n = 0 ; n < word2[m].length; n++)
                    {
                        if (word2[m][n] == element)
                        {
                            System.out.println(element  =" ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }

    public static void printArr(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }
}
