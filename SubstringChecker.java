import java.util.Scanner;

public class SubstringChecker {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the larger string
        System.out.print("Enter the larger string: ");
        String mainString = getStringInput();

        // Prompt the user to enter the substring to check
        System.out.print("Enter the substring to check: ");
        String subString = getStringInput();

        // Check if the substring exists in the larger string
        boolean isSubstring = checkForSubstring(mainString, subString);

        // Display the result
        if (isSubstring) {
            System.out.println("The substring exists in the larger string.");
        } else {
            System.out.println("The substring does not exist in the larger string.");
        }

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to check if a substring exists in a larger string
    public static boolean checkForSubstring(String mainString, String subString) {
        // Use the contains() method of the String class
        return mainString.contains(subString);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
