import java.util.*;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initializes the scanner for input
        int favInt; // variable to store the user's favorite int
        double favDouble; // variable to store the user's favorite double
        favInt = SafeInput.getInt(in, "What is your favorite int?"); // uses SafeInput to get the user's favorite int and sets it to the int variable
        favDouble = SafeInput.getDouble(in, "What is your favorite double?"); // uses SafeInput to get the user's favorite double and sets it to the double variable

        System.out.println("Your favorite int is: " + favInt + "\nYour favorite double is: " + favDouble); // prints out the user's favorite int and double
    }
}
