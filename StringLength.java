import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the getLength function to calculate the length of the string
        int length = getLength(inputString);

        // Display the length of the string
        System.out.println("Length of the string: " + length);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to calculate the length of a string
    private static int getLength(String input) {
        // Use the length() method of the String class
        return input.length();
    }
}
