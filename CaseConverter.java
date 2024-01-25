import java.util.Scanner;

public class CaseConverter {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = getStringInput();

        // Convert the string to uppercase and display
        String upperCaseString = convertToUpperCase(inputString);
        System.out.println("Uppercase string: " + upperCaseString);

        // Convert the string to lowercase and display
        String lowerCaseString = convertToLowerCase(inputString);
        System.out.println("Lowercase string: " + lowerCaseString);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to convert a string to uppercase
    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    // Function to convert a string to lowercase
    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
