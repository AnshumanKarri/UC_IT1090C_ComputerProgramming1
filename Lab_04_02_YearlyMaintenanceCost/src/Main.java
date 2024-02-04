public class Main
{
    public static void main(String[] args)
    {
        // input values for the maintenance cost for each of the four seasons
        double summerMaintenanceCost = 250;
        double springMaintenanceCost = 250;
        double winterMaintenanceCost = 250;
        double fallMaintenanceCost = 250;
        double yearlyMaintenanceCost = summerMaintenanceCost + springMaintenanceCost + winterMaintenanceCost + fallMaintenanceCost; // statement to compute the yearly maintenance cost using the seasonal costs given by the user

        System.out.println("Summer Maintenance Cost: " + summerMaintenanceCost + "\n" + "Spring Maintenance Cost: " + springMaintenanceCost + "\n" +
                "Winter Maintenance Cost: " + winterMaintenanceCost + "\n" + "Fall Maintenance Cost: " + fallMaintenanceCost + "\n" +
                "\n" + "Yearly Maintenance Cost: " + yearlyMaintenanceCost); // output statement for seasonal and yearly maintenance costs-
    }
}