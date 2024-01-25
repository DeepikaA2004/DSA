import java.util.Scanner;

public class DuplicateRemover {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string with duplicate characters: ");
        String inputString = getStringInput();

        // Remove duplicate characters and display the result
        String stringWithoutDuplicates = removeDuplicates(inputString);
        System.out.println("String after removing duplicates: " + stringWithoutDuplicates);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to remove duplicate characters from a string
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] charSet = new boolean[256]; // Assuming ASCII characters

        for (char ch : input.toCharArray()) {
            if (!charSet[ch]) {
                result.append(ch);
                charSet[ch] = true;
            }
        }

        return result.toString();
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
