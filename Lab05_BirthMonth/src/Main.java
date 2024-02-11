import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        System.out.println("What is your birth month?");
        birthMonth = in.nextInt();
        if (birthMonth >= 1 && birthMonth <= 12)
            System.out.println("Your birth month is: " + birthMonth);
        else
            System.out.println("asdjihf entered an incorrect month value: " + birthMonth);
    }
}