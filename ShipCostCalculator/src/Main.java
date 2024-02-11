import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price, shippingCost;

        System.out.println("What is the price of the item?");
        price = in.nextDouble();

        if (price >= 100)
            shippingCost = 0;
        else
            shippingCost = price * 0.02;

        System.out.println("The price is $" + price + ".");
        System.out.println("The shipping cost is $" + shippingCost + ".");
    }
}