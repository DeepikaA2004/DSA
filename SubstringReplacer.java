import java.util.Scanner;

public class SubstringReplacer {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = getStringInput();

        // Prompt the user to enter the substring to replace
        System.out.print("Enter the substring to replace: ");
        String targetSubstring = getStringInput();

        // Prompt the user to enter the replacement string
        System.out.print("Enter the replacement string: ");
        String replacementString = getStringInput();

        // Replace all occurrences of the substring and display the result
        String resultString = replaceSubstring(mainString, targetSubstring, replacementString);
        System.out.println("Result after replacement: " + resultString);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to replace all occurrences of a substring in a string
    public static String replaceSubstring(String mainString, String targetSubstring, String replacementString) {
        // Use the replaceAll() method of the String class
        return mainString.replaceAll(targetSubstring, replacementString);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
