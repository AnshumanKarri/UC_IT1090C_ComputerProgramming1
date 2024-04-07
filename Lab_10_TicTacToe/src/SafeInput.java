import java.util.*;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do { // blocks input to only strings that have a length greater than 0
            System.out.print("\n" + prompt + ": ");// show prompt add space
            retString = pipe.nextLine(); // stores that input into the variable to check and return
        } while(retString.length() == 0); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern

        return retString; // returns the string input given by the user

    }
    public static int getInt(Scanner pipe, String prompt) {
        int num = 0; // int variable to store the user's input
        boolean validInput = false; // boolean for checking input validity
        do { // loop to block input to only int values
            System.out.print("\n" + prompt + ": "); // prints out the prompt
            if (pipe.hasNextInt()) { // checks if there is an int value to read
                num = pipe.nextInt(); // reads that int value into the int variable
                validInput = true; // sets the validity boolean to true since the user has successfully entered an int value
            }
            pipe.nextLine(); // reads the trash input and clears the pipe
        } while (!validInput); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return num; // returns the int value
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double num = 0; // double variable to store the user's input
        boolean validInput = false; // boolean for checking input validity
        do { // loop to block input to only doubles
            System.out.print("\n" + prompt + ": "); // prints out prompt
            if (pipe.hasNextDouble()) { // checks if there is an input in the form of a double
                num = pipe.nextDouble(); // reads that double value into the double variable
                validInput = true; // sets the validity boolean to true since the user has successfully entered a double value
            }
            pipe.nextLine(); // reads trash input and clears the pipe
        } while (!validInput); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return num; // returns the double value
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean isValid = false; // boolean for checking input validity
        int num = 0; // int variable to store the user's input
        do { // loop that blocks input to only int values in the given range
            System.out.print("\n" + prompt + ": "); // prints out prompt
            if (pipe.hasNextInt()) { // checks if there is an int input
                num = pipe.nextInt(); // sets that int input to the int variable
            }
            pipe.nextLine(); // reads the trash input and clears the pipe
            isValid = num >= low && num <= high; // if the int is in the given low and high range parameters, it is set to true; otherwise it is set to false
        } while (!isValid); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return num; // returns the int value
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean isValid = false; // boolean for checking input validity
        double num = 0; // double variable to store the user's input
        do { // loop to block input to a double that is in the range of the given parameters
            System.out.print("\n" + prompt + ": "); // prints out prompt
            if (pipe.hasNextDouble()) { // checks if there is input from the user that is in the form of a double
                num = pipe.nextDouble(); // sets that double input to the double variable
            }
            pipe.nextLine(); // reads the trash input and clears the pipe to get proper input
            isValid = num >= low && num <= high; // if the input is in the range of the given low and high parameters, the variable is set to false; otherwise, it is set to false.
        } while (!isValid); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return num; // returns the double value
    }
    public static boolean getYNConfirm (Scanner pipe, String prompt) {
        boolean isValid = false; // boolean for checking input validity
        String uInput = " "; // String variable to store the user's input
        do { // loop to block input to only y or n
            System.out.print("\n" + prompt + ": "); // prints out prompt
            if (pipe.hasNextLine()) { // checks if there is input
                uInput = pipe.nextLine(); // stores that input into the variable to check and return
            }
            isValid = uInput.equalsIgnoreCase("Y") || uInput.equalsIgnoreCase("N"); // set to true if input is either y or n; otherwise, it is set to false.
        } while (!isValid); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return uInput.equalsIgnoreCase("Y"); // returns true or false, based off of if the user enters y or n.
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String regExStr = ""; // variable to store regEx
        boolean isValid = false; // boolean for checking input validity
        do { // loop to block input to strings only according the regex pattern
            System.out.print("\n" + prompt + ": "); // prints out prompt
            if (pipe.hasNextLine()) { // checks if there is input
                regExStr = pipe.nextLine(); // stores that input into the variable to check and return
            }
            isValid = regExStr.matches(regEx); // cross-checks with the given regex pattern parameter. If the check returns true, then stores true; if it returns false, then stores false.
        } while (!isValid); // checks if the validity boolean is false, and if so, runs the loop again to get another input until the user inputs the correct pattern
        return regExStr; // returns the regex string given by the user
    }
    public static void prettyHeader(String msg) {
        for (int i = 0; i < 60; i++) { // prints out first row of stars
            System.out.print("*");
        } System.out.println();
        for (int i = 0; i < 3; i++) { // prints out first of 3 stars in second row
            System.out.print("*");
        }
        if (msg.length() % 2 == 0) { // checks if the length of the message is even
            for (int i = 0; i < (54-msg.length())/2; i++) { // prints out first set of spaces
                System.out.print(" ");
            }
            System.out.print(msg); // prints out message
            for (int i = 0; i < (54-msg.length())/2; i++) { // prints out last set of spaces
                System.out.print(" ");
            }
        } else { // checks if the length of the message is odd
            for (int i = 0; i < (54-msg.length())/2; i++) { // prints out first spaces
                System.out.print(" ");
            }
            System.out.print(msg); // prints out message
            for (int i = 0; i < (54-msg.length())/2+1; i++) { // prints out last set of spaces and adds one so the total length of the line is 60
                System.out.print(" ");
            }
        }
        for (int i = 0; i < 3; i++) { // prints out last set of 3 stars in second row
            System.out.print("*");
        } System.out.println();
        for (int i = 0; i < 60; i++) { // prints out third row of stars
            System.out.print("*");
        } System.out.println();
    }
}