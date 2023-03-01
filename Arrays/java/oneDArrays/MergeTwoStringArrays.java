package oneDArrays;

public class MergeTwoStringArrays {

    public static void main(String[] args) {
        String str[] = {"coffee" , "chai"};
        String str1[] = {"milk" , "sugar" , "curd"};

        String mergArr[] = new String[str.length + str1.length];

        System.arraycopy(str , 0 ,mergArr , 0 , str.length);
        System.arraycopy(str1 , 0,mergArr , str.length , str1.length);

        System.out.println("Merger Array : ");
        for (String element : mergArr)
        {
            System.out.println(element);
        }
    }
}
