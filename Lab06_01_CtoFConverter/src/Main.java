import java.util.*;

public class Main {
    public static void main(String[] args) {
        double cTemp = 0.0;// initialization of a variable for the degrees celcius
        double fTemp = 0.0;// initialization of a variable for the degrees fahrenheit
        boolean isValid = false;// boolean variable that will be used to trap input for only double values
        String trash = ""; // trash variable just incase the user does not input the correct type of value
        Scanner in = new Scanner(System.in); // initialzation of the scanner class for user input
        do {// loop to trap input
            System.out.println("Enter a temperature in degrees celcius:");//asks user for temperature in degrees celcius
            if (in.hasNextDouble()){//checks if there is double that could be read
                cTemp = in.nextDouble();// reads the the double input from the user and sets it to the cTemp variable
                isValid = true;// makes the boolean variable true so that it knows that the user has given the correct input and 
            } else
                trash = in.nextLine();// makes sure the invalid input is handled and will store the it in the trash variable so that the input does not get wasted and keeps the loop from continuously running without letting the uer input a value
        }
        while(!isValid);// checks if the boolean variable is false which would mean the user has not entered a valid value, so it will keep running the loop
        fTemp = cTemp * (9/5.0) + 32; // converts the degrees celcius to degrees fahrenheit using a formula
        System.out.printf("%f degres celcius is equal to %f degrees fahrenheit", cTemp, fTemp);// prints out the degrees celcius and converted degrees fahrenheit using printf

    }
}