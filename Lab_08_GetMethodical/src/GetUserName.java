import java.util.*;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initializes the scanner for input
        String firstName = ""; // variable to store the first name
        String lastName = ""; // variable to store the last name
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // uses the SafeInput to get a first name that is not 0 characters and sets it to the first name variable
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // uses the SafeInput to get a last name that is not 0 characters and sets it to the last name variable
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // prints out the first and last name
    }
}