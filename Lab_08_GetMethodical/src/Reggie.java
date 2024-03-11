import java.util.*;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initializes the scanner for input

        String SSNRegEx = "^\\d{3}-\\d{2}-\\d{4}$"; // reg ex pattern for ssn
        String UCRegEx = "^(M|m)\\d{5}$"; // reg ex pattern for uc id
        String mChoiceRegEx = "^[OoSsVvQq]$"; // reg ex patter for menu choice

        String SSN = SafeInput.getRegExString(in, "What is your SSN?", SSNRegEx); // gets SSN in reg ex pattern string using SafeInput
        String UCID = SafeInput.getRegExString(in, "What is your UC ID?", UCRegEx);  // gets UC ID in reg ex pattern string using SafeInput
        String mChoice = SafeInput.getRegExString(in, "What is your menu choice?", mChoiceRegEx); // gets menu choice in reg ex pattern string using SafeInput

        System.out.println("Your SSN is: " + SSN); // prints out ssn
        System.out.println("Your UC ID is: " + UCID); // prints out UC ID
        System.out.println("Your menu choice is: " + mChoice); // prints out menu choice
    }
}
