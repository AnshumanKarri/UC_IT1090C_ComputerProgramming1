import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import javax.swing.*;
import java.io.*;

import static java.nio.file.StandardOpenOption.CREATE;

public class Main {
    public static void main(String[] args) {
        // variable declarations and initializations to be used later
        JFileChooser fileChooser = new JFileChooser();
        File file, workingDirectory;
        Path filePath;
        InputStream in;
        BufferedReader reader;
        int amntOfLines = 0, amntOfWords = 0, amntOfChars = 0, amntOfSpaces = 0;
        String line;

        // try-catch statement to find any errors that happened and won't completely break the code.
        try {
            workingDirectory = new File(System.getProperty("user.dir")); // Shows the user the window to select the file they want to read
            fileChooser.setCurrentDirectory(workingDirectory); // sets current directory to the file directory the user chose

            // checks if the open-file button has been clicked
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile(); // sets the current file to the file the user has chosen
                filePath = file.toPath(); // gets the path of the file

                in = new BufferedInputStream(Files.newInputStream(filePath, CREATE)); // creates an input stream of bytes
                reader = new BufferedReader(new InputStreamReader(in)); //  sets up a reader to read from the input stream

                // this loop only runs while if the file is ready to be read and still has stuff to read
                while (reader.ready()) {
                    line = reader.readLine(); // gets the next line in the text file
                    amntOfLines++;
                    amntOfChars += line.length();
                    amntOfSpaces = 0;
                    // loops through all the characters in the line
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == ' ') // increments the amount of spaces counter only if the current character read is a space
                            amntOfSpaces++;
                    }
                    amntOfWords += amntOfSpaces + 1; // uses the amount of spaces to get the amount of words in the file. This assumes there are no extra spaces in the file.
                }
                reader.close(); // must close the file to seal it and flush buffer

                // output to tell the user the file has successfully been read; the amount of lines, words, and characters
                System.out.println("Data File Read!");
                System.out.println("File name: " + filePath);
                System.out.println("Amount of lines in file: " + amntOfLines);
                System.out.println("Amount of words in the file: " + amntOfWords);
                System.out.println("Amount of characters in the file: " + amntOfChars);
            }
        } catch (FileNotFoundException e) { // if the file the user wants to read isn't found, the program will let the user know this.
            System.out.println("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) { // will log an I/O error if there is one
            e.printStackTrace();
        }

    }
}