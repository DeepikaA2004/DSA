import java.util.Scanner;

public class SpaceRemover {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string with extra spaces: ");
        String inputString = getStringInput();

        // Remove extra spaces and display the result
        String trimmedString = removeExtraSpaces(inputString);
        System.out.println("String after removing extra spaces: " + trimmedString);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to remove leading, trailing, and duplicate spaces
    public static String removeExtraSpaces(String input) {
        // Use regex to replace multiple spaces with a single space
        String trimmedString = input.replaceAll("\\s+", " ");

        // Use trim() to remove leading and trailing spaces
        return trimmedString.trim();
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
