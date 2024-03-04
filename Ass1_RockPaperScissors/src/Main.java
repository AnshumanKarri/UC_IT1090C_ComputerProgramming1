import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //initializes scanner
        boolean continuePlaying = true; // boolean to check if the player wants to continue playing
        boolean correctInput = false; // boolean to check if inputs are correct
        String p1 = " "; // player one choice variable
        String p2 = " "; // player two choice variable
        String choice = ""; // choice to select Y or N when determining if the player wants to play again
        do {// start of a do while loop to run once and check if player wants to play again
            System.out.println("Welcome to rock, paper, scissors!"); // welcoming statement
            System.out.println("Player 1 make your move (R, P, S): "); // prompt for player one move
            correctInput = false; // makes sure boolean to check inputs is initialized to false
            while (!correctInput){ // loops if boolean is false meaning there is a wrong input
                 if (in.hasNextLine()){ // checks if there is a string input
                     p1 = in.nextLine(); // adds that string input to player one choice variable
                 } if (p1.equalsIgnoreCase("R") ||
                        p1.equalsIgnoreCase("P") ||
                        p1.equalsIgnoreCase("S")) { // checks if it is the correct input
                    correctInput = true; // sets boolean to true meaning it is the correct input and will break from the loop
                }
            }
            correctInput = false; // makes sure boolean to check inputs is initialized to false
            System.out.println("Player 2 make your move (R, P, S): "); // prompt for player two move
            while (!correctInput){ // loops if boolean is false meaning there is a wrong input
                if (in.hasNextLine()){ // checks if there is a string input
                    p2 = in.nextLine(); // adds that string input to player one choice variable
                } if (p2.equalsIgnoreCase("R") ||
                        p2.equalsIgnoreCase("P") ||
                        p2.equalsIgnoreCase("S")) { // checks if it is the correct input
                    correctInput = true; // sets boolean to true meaning it is the correct input and will break from the loop
                }
            }
            if (p1.equalsIgnoreCase("R") && p2.equalsIgnoreCase("P")) { // checks if player one is rock and player two is paper
                System.out.println("Paper covers rock.\nPlayer 2 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("P") && p2.equalsIgnoreCase("R")) { // checks if player one is paper and player two is rock
                System.out.println("Paper  covers rock.\nPlayer 1 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("R") && p2.equalsIgnoreCase("S")) { // checks if player one is rock and player two is scissors
                System.out.println("Rock breaks scissors.\nPlayer 1 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("S") && p2.equalsIgnoreCase("R")) { // checks if player one is scissors and player two is rock
                System.out.println("Rock breaks scissors.\nPlayer 2 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("P") && p2.equalsIgnoreCase("S")) { // checks if player one is paper and player two is scissors
                System.out.println("Scissors cuts paper.\nPlayer 2 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("S") && p2.equalsIgnoreCase("P")) { // checks if player one is scissors and player two is paper
                System.out.println("Scissors cuts paper.\nPlayer 1 wins!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("R") && p2.equalsIgnoreCase("R")) { // checks if both player one and player two entered rock
                System.out.println("Rock vs Rock.\nIt's a tie!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("P") && p2.equalsIgnoreCase("P")) { // checks if both player one and player two entered paper
                System.out.println("Paper vs Paper.\nIt's a tie!!"); // prints the appropriate response according to conditional
            } else if (p1.equalsIgnoreCase("S") && p2.equalsIgnoreCase("S")) { // checks if player one and player two entered scissors
                System.out.println("Scissors vs Scissors.\nIt's a tie!!"); // prints the appropriate response according to conditional
            }
            System.out.println("Would you like to play again(Y/N)?: "); // prompts user if he/she wants to play again
            if (in.hasNextLine()) { // checks if there is a string input
                choice = in.nextLine(); // adds that string input to the choice variable
            }
            correctInput = choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N"); // if the input is Y or N, correctInput will be true, and the loop will be skipped; otherwise, correctInput will be false and the following loop will be run
            while (!correctInput) { // loop to trap input for Y or N
                System.out.println("Please enter Y or N: "); // reprompts user for Y or N
                if (in.hasNextLine()) { // checks if there is a string input
                    choice = in.nextLine(); // assigns that string input to choice
                }
                correctInput = choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N"); // if choice is Y or N, correctInput will become true and the loop will stop; otherwise, correctInput will be false and the loop will continue
            }
            continuePlaying = choice.equalsIgnoreCase("Y"); // if choice is Y, then the boolean will be true and the game loop will continue; otherwise, the boolean will be false, and the game loop will stop
        } while (continuePlaying); // checks to see if the player wants to continue playing using a boolean
    }
}