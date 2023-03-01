package oneDArrays;

public class MinimumLengthOfWordAlongIndex {

    public static void main(String[] args) {

        String[]  arr = { "sowji" , "ram" , "vamsi" , "bhavana"};

        String word = arr[0];
        int index = 0 ;

        // min word and Index
        for (int i = 1 ; i < arr.length ; i++)
        {
            if (arr[i].length() < word.length())
            {
                word = arr[i];
                index = i ;
            }
        }
        System.out.println("The minimum length word in the array is  : " + word + " and its index is :  " + index + ".");

        // Max word and Index
        for (int i1 = 1 ; i1 < arr.length ; i1++)
        {
            if (arr[i1].length() > word.length())
            {
                word = arr[i1];
                index = i1 ;
            }
        }
        System.out.println("The max Word is :" + word + " and Its Index Is : " + index);
    }
}
