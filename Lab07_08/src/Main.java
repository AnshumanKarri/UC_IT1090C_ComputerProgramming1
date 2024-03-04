import java.util.*;

public class Main {
    public static void main(String[] args) {
        double temp = 0;// initializes the temperature variable
        boolean validTemp = false;//variable to check if a input is valid
        char type = ' ';
        Scanner in = new Scanner(System.in);
        do {//do while loop to block the user from entering an invalid input
            System.out.println("Please enter the temperature: ");//prompts the user for the temperature
            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                validTemp = true;
            }
        } while(!validTemp);//checks if valid temp is still false which would mean the user has not entered a valid value

        System.out.println("Would you like to convert to C or F?: ");// prompts the user what they want to convert to
        if (in.hasNextLine());
        {
            type = in.nextLine();
        }
    }
}