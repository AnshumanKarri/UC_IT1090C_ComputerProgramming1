import java.util.*;

public class Main {
    public static void main(String[] args) {
        double cTemp = 0.0;
        double fTemp = 0.0;
        boolean isValid = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a temperature in degrees celcius:");
            if (in.hasNextDouble()){
                cTemp = in.nextDouble();
                isValid = true;
            } else
                trash = in.nextLine();
        }
        while(!isValid);
        fTemp = cTemp * (9/5.0) + 32;
        System.out.printf("%f degres celcius is equal to %f degrees fahrenheit", cTemp, fTemp);

    }
}