import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        try {
            System.out.println("Enter the first number: ");
            num1 = in.nextInt();
            System.out.println("Enter the second number: ");
            num2 = in.nextInt();
            if (num1 == num2)
                System.out.println("The numbers are equal.");
            else if (num1 > num2)
                System.out.println("The second number is less than the first number.");
            else
                System.out.println("The first number is less than the second number");
        } catch(InputMismatchException e) {
            System.out.println("That is not a number. Try again.");
        }
    }
}