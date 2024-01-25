import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Call the reverseString function to reverse the string
            String reversedString = reverseString(inputString);

            // Display the reversed string
            System.out.println("Reversed String: " + reversedString);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Function to reverse the characters in a string
    private static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Reverse the character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
