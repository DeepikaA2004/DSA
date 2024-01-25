import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacterFinder {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = getStringInput();

        // Find the most frequent character and display the result
        char mostFrequentChar = findMostFrequentCharacter(inputString);
        System.out.println("Most frequent character: " + mostFrequentChar);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to find the most frequent character in a string
    public static char findMostFrequentCharacter(String input) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum frequency
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
