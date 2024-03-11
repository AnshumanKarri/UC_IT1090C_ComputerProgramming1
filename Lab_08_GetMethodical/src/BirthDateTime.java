import java.util.*;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // initializes the scanner for input
        int year = 0; // variable to store the year
        int month = 0; // variable to store the month
        int day = 0; // variable to store the day
        int hours = 0; // variable to store teh hour
        int minutes = 0; // variable to store the minute
        year = SafeInput.getRangedInt(in, "What year were you born?", 1950, 2015); // uses SafeInput to get a year in the specific range
        month = SafeInput.getRangedInt(in, "What month were you born?", 1, 12); // uses SafeInput to get a month with number 1-12
        day = switch (month) { // switch cases statement to get a day based off of the given month and how many days it has
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 31); // case to get a day for all the months that have 31 days
            case 4, 6, 9, 11 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 30); // case to get a day for all the months that have 30 days
            case 2 -> SafeInput.getRangedInt(in, "What day were you born?", 1, 29); // case to get a day for february that has 29 days
            default -> day; // defaults to this just in case the month does match any of the previous cases
        };
        hours = SafeInput.getRangedInt(in, "What hour were you born?", 1, 24); // gets an hour in the 24-hour range
        minutes = SafeInput.getRangedInt(in, "What minute were you born", 1, 59); // gets a minute in the 1-59 minute range
        System.out.println("You were born " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes); // formats and prints out the date-of-birth and time-of-birth
    }
}
