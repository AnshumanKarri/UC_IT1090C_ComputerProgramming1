//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //declaration and initial assignment of int variables
        int intOperandA = 20;
        int intOperandB = 11;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

        //declaration and initial assignment of double variables
        double doubleOperandA = 12.3;
        double doubleOperandB = 45.6;
        double doubleSum = 7.0;
        double doubleProduct = 8.0;
        double doubleDifference = 9.0;
        double doubleQuotient = 10.0;
        double doubleModulo = 11.0;

        // Other variable declarations
        int amountOfKids;
        boolean isRaining;
        double gallonGasPrice;
        int favNum;
        int shoeSize;
        int birthMonth;
        String fullName;

        // Assignments to int variable using other int variable using all 5 arithmetic operators
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        //output statements for the result of the arithmetic operations using int variables
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // Assignments to double variable using other int variable using all 5 arithmetic operators
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - intOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //output statements for the result of the arithmetic operations using double variables
        System.out.println("The sum using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}