
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose The Option Given Below");
        System.out.println("Option 1. Palindrome.");
        System.out.println("Option 2. Factorial.");
        System.out.println("\n\nPress any other number for exit.");

        Scanner scan=new Scanner(System.in);
        int chooseOption=scan.nextInt();

        switch(chooseOption)
        {
            case 1:
                Palindrome pal=new Palindrome();
                System.out.println("Enter a Number to check Whether it is Palindrome or Not:");
                int palnum=scan.nextInt();
                System.out.println(pal.palindromeNumber(palnum));
                break;

            case 2:
                Factorial fact=new Factorial();
                System.out.println("Enter a Number to check Whether it is Palindrome or Not:");
                int factnum=scan.nextInt();
                System.out.println(fact.factorialReturn(factnum));
                break;

            default:
                System.out.println("Programme Terminated");
                break;
        }

    }
}
