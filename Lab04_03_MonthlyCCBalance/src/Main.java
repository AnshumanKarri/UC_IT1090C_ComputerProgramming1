public class Main
{
    public static void main(String[] args)
    {
        double ccBalance = 5000.0; // declaration and initialization of credit card balance variable
        double m1Interest = ccBalance * 0.17; // processing statement to calculate the interest after 1 month
        double m2Interest = ccBalance * 0.17 + m1Interest; // processing statement to calculate the interest after 2 months
        System.out.println("The interest due after 1 month is " + m1Interest + "\nThe interest due after 2 months is " + m2Interest); //output statement for the interest due after 1 month and 2 months
    }
}