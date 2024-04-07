import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.sound.midi.SysexMessage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] dataPoints = new int[100]; // declares an int array with a length off 100
        Random rnd = new Random(); // creates the random object
        int sum = 0; // initialization of sum variable
        double average = 0; // initialization of average variable
        int userVal = 0; // initialization of the user's value variable
        int userVal2 = 0; // initialization of the user's second value variable
        int amtInArr = 0; // initialization of the variable to count how many times the user's input value is in the array
        int minVal; // declares the variable for the minimum value of the array
        int maxVal; // declares the variable for the maximum value of the array
        boolean foundInArray = false;

        for (int i = 0; i < 100; i++) { // loop to fill in array with random ints 1-100
            dataPoints[i] = rnd.nextInt(100)+1; // sets each value in the array to a random int 1-100
        }
        for (int val: dataPoints) { // loop to print out all values
            System.out.print(val + " | "); // prints out the value and then adds some formating
        }
        System.out.println(); // goes to a new line

        average =   (double) sum(dataPoints) / dataPoints.length; // calculates the average by dividing the sum variable by the length of the random array

        System.out.println("Sum of random array dataPoints: " + sum); // prints out the total sum of the random array
        System.out.println("Average of random array dataPoints: " + average); // prints out the average of the random array

        userVal = SafeInput.getRangedInt(in, "Please enter a value from 1 to 100: ", 1, 100); // gets value from the user that is from 1-100

        System.out.println("Your number appears " + occuranceScan(dataPoints, userVal) + " times in the random array dataPoints."); // prints out the amount of times the user's value is found in the array

        userVal2 = SafeInput.getRangedInt(in, "Please enter a value from 1 to 100: ", 1, 100); // gets value from the user that is from 1-100

        if (contains(dataPoints, userVal2)) { // checks if the user's value is found in the array
            System.out.println("Your value " + userVal2 + " was first found at position " + findValue(dataPoints, userVal2) + " in the random array dataPoints"); // prints out the position at which the user's value was first found
        } else { // this runs if the method returns false which would mean the value was not found in the array
            System.out.println("Your value " + userVal2 + " was not found in the random array dataPoints."); // tells the user that their value was not found in the array
        }

        System.out.println("\nThe minimum value in the random array dataPoints is " + min(dataPoints)); // prints out the minimum value of the array
        System.out.println("The maximum value in the random array dataPoints is " + max(dataPoints)); // prints out the maximum value of the array

        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints)); // prints out the average of the array
    }
    public static double getAverage(int [] values) { // function to calculate the average of a double array
        int sum = 0; // initialization of a sum variable;
        for (int val: values) { // loop to add up all the values
            sum += val; // adds the value to the total sum
        }
        return (double) sum / values.length; // returns the average of the array by dividing the sum and the length of the array
    }
    public static int min(int [] values) { // method to get the minimum value of a given array
        int min = values[0]; // initializes the minVal variable to the first value in the array
        for (int val: values) { // loops through all the values to find the min and max value
            if (val < min) { // checks if the value is lower than the current min value
                min = val; // if so, it sets val as the new minVal
            }
        }
        return min; // returns the min value of the array
    }
    public static int max(int [] values) { // method to get the maximum value of the given array
        int max = values[0]; // initializes the minVal variable to the first value in the array
        for (int val: values) { // loops through all the values to find the min and max value
            if (val > max) { // checks if the value is lower than the current min value
                max = val; // if so, it sets val as the new minVal
            }
        }
        return max; // returns the max value of the array
    }
    public static int occuranceScan(int [] values, int target)  { // method to get the amount of times a value appears in an array
        int amtInArr = 0; // initialization of the variable to count how many times the user's input value is in the array
        for (int val: values) { // loop to count how many times the user's entered vaue appears in the array
            if (val == target) { // conditional to check if the value is the value entered by the user
                amtInArr++; // increments the counter variable whenever the user's entered value is found within the array
            }
        }
        return amtInArr; // returns the amount of times a value appears in an array
    }
    public static int sum(int [] values) { // returns the sum of the values in the array
        int sum = 0; // initialization of sum variable to sum up all the values in the array
        for (int val: values) { // loop to add up all the values in the random array
            sum += val; // adds each value to the sum variable
        }
        return sum; // returns the sum of all the values
    }
    public static boolean contains(int [] values, int target) { // Returns true if the values array contains target
        for (int i = 0; i < values.length; i++) { // loop to go through the array and find the first instance that the value is found at
            if (values[i] == target) { // compares the value at the specific index is the same as the user's second value
                return true; // returns true to end the method if the target is found in the array
            }
        }
        return false; // if the loop ends, that means the target was not found in the array so it returns false
    }
    public static int findValue(int [] values, int target) {
        for (int i = 0; i < values.length; i++) { // loop to go through the array and find the first instance that the value is found at
            if (values[i] == target) { // compares the value at the specific index is the same as the user's second value
                return i; // returns the position of the value
            }
        }
        return -1; // returns -1 just in-case the value was not found
    }
}