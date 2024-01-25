import java.util.Scanner;

public class CharacterOccurence {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = getStringInput();

        // Prompt the user to enter a character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = getCharInput();

        // Find and display the index of the first occurrence
        int firstOccurrenceIndex = findFirstOccurrence(inputString, searchChar);
        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Character not found in the string.");
        }

        // Find and display the index of the last occurrence
        int lastOccurrenceIndex = findLastOccurrence(inputString, searchChar);
        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence index: " + lastOccurrenceIndex);
        } else {
            System.out.println("Character not found in the string.");
        }

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to read a character input
    public static char getCharInput() {
        return scanner.next().charAt(0);
    }

    // Function to find the index of the first occurrence of a character
    public static int findFirstOccurrence(String input, char target) {
        return input.indexOf(target);
    }

    // Function to find the index of the last occurrence of a character
    public static int findLastOccurrence(String input, char target) {
        return input.lastIndexOf(target);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
