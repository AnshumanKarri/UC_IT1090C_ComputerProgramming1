import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*; // import statement for scanner and arraylist

import static java.nio.file.StandardOpenOption.CREATE;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); // input scanner pipline
        String userChoice = ""; // variable to hold the user's input choice
        String itemToAdd = ""; // variable to hold the user's item choice to add
        int itemIndex = 0; // variable to hold the index that the user enters to remove the item at that index
        boolean needsToBeSaved = true;
        JFileChooser fileChooser = new JFileChooser();
        File file, workingDirectory;
        Path filePath = null;
        InputStream inStream;
        OutputStream outStream;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        ArrayList<String> userInputs = new ArrayList<String>(); // arraylist to hold all the user's items

        while (!userChoice.equals("Q") || !userChoice.equals("q")){ // while loop that keeps running as long as the input isn't quit so the user can keep entering values
            System.out.println(); // println for output formatting
            printArrayList(userInputs); // prints out what the arraylist currently but doesn't number them
            System.out.println(); // println for output formatting
            printChoices(); // prints out the choices the user can choose from
            userChoice = SafeInput.getRegExString(in, "What would you like to do?", "[AaDdVvQqOoSsCc]"); // gets the user's input choice using a regex string and safe input
            switch (userChoice) { // switch statement to go through all the possible user choices and execute the following parts for the corresponding choice
                case "Q", "q" ->  {// statement to quit the program
                    quitProgram(); // function call to quit the program
                    reader.close(); // must close the file to seal it and flush buffer
                    writer.close(); // must close the file to seal it and flush buffer
                }
                case "A", "a" -> { // statement to add an item
                    itemToAdd = SafeInput.getNonZeroLenString(in, "What would you like to add to the list?"); // gets a non-0-length string and puts it into a variable
                    addItem(userInputs, itemToAdd); // adds the non-0-length string to the arraylist
                    needsToBeSaved = true;
                }
                case "D", "d" -> { // statement for deleting an item
                    itemIndex = SafeInput.getRangedInt(in, "What number item would you like to delete?", 1, userInputs.size()); // gets an int from the user that is between 1 and the highest index of the arraylist
                    deleteItem(userInputs, itemIndex - 1); // removes the item that is at the given index by the user
                    needsToBeSaved = true;
                }
                case "O", "o" -> {
                    try {
                        workingDirectory = new File(System.getProperty("user.dir")); // Shows the user the window to select the file they want to read
                        fileChooser.setCurrentDirectory(workingDirectory); // sets current directory to the file directory the user chose

                        // checks if the open-file button has been clicked
                        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                            file = fileChooser.getSelectedFile(); // sets the current file to the file the user has chosen
                            filePath = file.toPath(); // gets the path of the file

                            inStream = new BufferedInputStream(Files.newInputStream(filePath, CREATE)); // creates an input stream of bytes
                            reader = new BufferedReader(new InputStreamReader(inStream)); //  sets up a reader to read from the input stream
                        }
                    } catch (FileNotFoundException e) { // if the file the user wants to read isn't found, the program will let the user know this.
                        System.out.println("File not found!!!");
                        e.printStackTrace();
                    } catch (IOException e) { // will log an I/O error if there is one
                        e.printStackTrace();
                    }
                }
                case "S", "s" -> {
                    outStream = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE));
                    writer = new BufferedWriter(new OutputStreamWriter(outStream));
                    if (needsToBeSaved) {
                        for (int i = 0; i < userInputs.size(); i++) {
                            writer.write(userInputs.get(i) + "\n");
                        }
                    }
                    needsToBeSaved = false;
                    System.out.println("List Saved!");
                }
                case "C", "c" -> {
                    userInputs.clear();
                    writer.flush();
                }
                case "V", "v" -> {
                    while (reader.ready())
                        System.out.println(reader.readLine());
                }
            }
        }
    }
    public static void printChoices() { // function to print all the possible choices
        System.out.println("A - Add an item to the list\nD - Delete an item from the list\nV - View the List\nQ - Quit"); // print statement to print out choices for the user to pick from
    }
    public static void printArrayList(ArrayList<String> arrayList) { // prints out what is currently in the list
        for (String s : arrayList) { // loops through all the items in the list
            System.out.println(s); // prints out the item line by line
        }
    }
    public static void addItem (ArrayList<String> array, String item) { // function to add an item to the arraylist
        array.add(item); // adds the given item to the arraylist
    }
    public static void deleteItem (ArrayList<String> array, int index) { // function to delete an item from an arraylist
        array.remove(index); // removes an item at the given index from the arraylist
    }
    public static void printNumberedList (ArrayList<String> arrayList) { // function to print out the arraylist items with numbers
        for (int i = 0; i < arrayList.size(); i++) { // loop to repeat for each item there is
            int index = i+1; // index number that adds one so that the numbers make more sense the user
            System.out.println(index + ": " + arrayList.get(i)); // prints out the number and list item
        }
    }
    public static void quitProgram () { // function to quit the program
        Scanner in = new Scanner(System.in); // establishes an input pipeline
        boolean quitChoice = SafeInput.getYNConfirm(in, "Are you sure? (Y or N)"); // asks the user if they are sure about quitting the program and gets a Y/N confirmation
        if (quitChoice) { // checks if the boolean variable is true which would mean the user said they are sure about quitting the program
            System.exit(0); // statement to quit the program
        }
    }
}