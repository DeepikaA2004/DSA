import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = getStringInput();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = getStringInput();

        // Check if the strings are anagrams and display the result
        boolean areAnagrams = checkAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to check if two strings are anagrams
    public static boolean checkAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the sorted characters of both strings are equal
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
