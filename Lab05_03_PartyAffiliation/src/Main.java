import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = " ";

        System.out.println("What political party are you affiliated with? (Enter either D, R, I, or O)");
        party = in.nextLine();

        if (party.equals("D"))
            System.out.println("You get a Democratic Donkey.");
        else if (party.equals("R"))
            System.out.println("You get a Republican Elephant.");
        else if (party.equals("I"))
            System.out.println("You get an Independent Person.");
        else if (party.equals("O"))
            System.out.println("You are an other.");
    }
}