import java.util.Scanner;

public class ConsecutiveRepeatingChecker {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = getStringInput();

        // Check if the string has any consecutive repeating characters
        boolean hasConsecutiveRepeatingChars = checkConsecutiveRepeatingChars(inputString);

        // Display the result
        if (hasConsecutiveRepeatingChars) {
            System.out.println("The string has consecutive repeating characters.");
        } else {
            System.out.println("The string does not have consecutive repeating characters.");
        }

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to check if a string has consecutive repeating characters
    public static boolean checkConsecutiveRepeatingChars(String input) {
        // Iterate through the string to check for consecutive repeating characters
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                return true; // Consecutive repeating characters found
            }
        }
        return false; // No consecutive repeating characters found
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
