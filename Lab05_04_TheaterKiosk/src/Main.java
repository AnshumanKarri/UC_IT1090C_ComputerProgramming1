import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = in.nextInt();
        if (age >= 21)
            System.out.println("You get a wrist band.");
    }
}