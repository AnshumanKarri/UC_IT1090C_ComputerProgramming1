import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        double distancePossible = 0;
        double costPer100 = 0;
        String trash = "";
        boolean isValid = false;

        do{
            System.out.println("Enter the number of gallons in the tank:");
            if (in.hasNextDouble()){
                gallons = in.nextDouble();
                isValid = true;
            } else
                trash = in.nextLine();
        } while(!isValid);
        isValid = false;
        trash = "";
        do{
            System.out.println("Enter the fuel efficiency in miles per gallon:");
            if (in.hasNextDouble()){
                efficiency = in.nextDouble();
                isValid = true;
            } else
                trash = in.nextLine();
        } while(!isValid);
        isValid = false;
        trash = "";
        do{
            System.out.println("Enter price of gas per gallon:");
            if (in.hasNextDouble()){
                price = in.nextDouble();
                isValid = true;
            } else
                trash = in.nextLine();
        } while(!isValid);
        costPer100 = 100 / efficiency * price;
        distancePossible = gallons * efficiency;
        System.out.printf("Your gas will cost $%f per 100 miles %nYou can go %f more miles with the remaining amount of gas in your tank.%n", costPer100, distancePossible);
    }
}