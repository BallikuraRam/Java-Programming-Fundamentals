import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        String s = "Hello.world.how.are.you";
        //used to eliminate the Given String
        StringTokenizer stringTokenizer = new StringTokenizer(s, ".");

        //print
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
