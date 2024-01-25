import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSplitter {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = getStringInput();

        // Prompt the user to enter a delimiter
        System.out.print("Enter the delimiter: ");
        String delimiter = getStringInput();

        // Split the string and display the result
        List<String> words = splitString(inputString, delimiter);
        System.out.println("List of words after splitting: " + words);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to split a string into a list of words based on a delimiter
    public static List<String> splitString(String input, String delimiter) {
        // Create a list to store the words
        List<String> words = new ArrayList<>();

        // Use the split() method of the String class
        String[] wordArray = input.split(delimiter);

        // Add the words to the list
        for (String word : wordArray) {
            words.add(word);
        }

        return words;
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
