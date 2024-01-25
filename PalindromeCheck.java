import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the entered string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to check if the string is a palindrome
        int i = 0, j = cleanedInput.length() - 1;
        while (i < j) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
