import java.util.*;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initializes the scanner for input
        double total = 0.00; // variable to store the total cost
        boolean continueCheckOut = false; // boolean to check if the user has more items and wants to continue checking out
        do { // loop to continue getting item prices if the user has multiple items
            total += SafeInput.getRangedDouble(in, "What is the price of your item?", 0.5, 10); // uses SafeInput to get a price that is in the form of a double and in the range of 0.5 to 10 and adds it to the total
            continueCheckOut = SafeInput.getYNConfirm(in, "Do you have more items to check out?"); // checks if user wants to continue checking out
        } while (continueCheckOut); // if continueCheckOut is true, then the loop will continue running and the user will continue entering item prices
        System.out.printf("Your total is: $%.2f", total); // prints out the total price and cuts off any decimals beyond the first two
    }
}
