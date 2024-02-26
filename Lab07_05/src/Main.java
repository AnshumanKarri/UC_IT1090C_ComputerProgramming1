public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)//loop for rows
        {
            for (int j = 0; j < i; j++)//loop for columns
            {
                System.out.print("*");//prints out stars
            }
            System.out.println();//goes to new line
        }
    }
}