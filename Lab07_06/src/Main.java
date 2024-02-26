public class Main {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--)//loop for counting rows
        {
            for (int j = i; j > 0; j--)//loop for counting columns
            {
                System.out.print("*");//prints out stars
            }
            System.out.println();//prints out a new line
        }
    }
}