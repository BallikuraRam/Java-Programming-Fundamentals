import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        // It's used to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number :");
        int i = scanner.nextInt();

        System.out.println("Enter 2d Number :");
        int j = scanner.nextInt();

        System.out.println("Addition of Your Numbers :" + (i + j));
        System.out.println("Substraction of Your Numbers :" + (i - j));
        System.out.println("Multiplication of Your Numbers :" + (i * j));
        System.out.println("Division of Your Numbers :" + (i / j));
    }
}
