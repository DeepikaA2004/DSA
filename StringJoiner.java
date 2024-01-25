import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringJoiner {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the number of strings to join
        System.out.print("Enter the number of strings to join: ");
        int numStrings = getIntegerInput();

        // Prompt the user to enter the strings
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            stringList.add(getStringInput());
        }

        // Prompt the user to enter the separator
        System.out.print("Enter the separator: ");
        String separator = getStringInput();

        // Join the strings and display the result
        String joinedString = joinStrings(stringList, separator);
        System.out.println("Joined string: " + joinedString);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read an integer input
    public static int getIntegerInput() {
        return scanner.nextInt();
    }

    // Function to read a string input
    public static String getStringInput() {
        scanner.nextLine(); // consume the newline character left by nextInt()
        return scanner.nextLine();
    }

    // Function to join a list of strings with a specified separator
    public static String joinStrings(List<String> stringList, String separator) {
        // Use the join() method of the String class (available from Java 8 onwards)
        return String.join(separator, stringList);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
