public class CtoFTableDisplay {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++) { // loop to go through Celsius values of -100 -> 100
            printTable(i, CtoF(i)); // prints out the Celsius value and the Fahrenheit value
        }
    }
    public static double CtoF(double celsius) { // method to covert from Celsius to Fahrenheit
        return celsius * 1.8 + 32; // calculates and returns the Fahrenheit value
    }
    public static void printTable(double c, double f) { // method to print out the temp values
        System.out.println(c + " degrees celsius = " + f + " degrees fahrenheit"); // prints out the Celsius and Fahrenheit values
    }
}