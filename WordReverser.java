import java.util.Scanner;

public class WordReverser {
    // Scanner object as a static member
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = getStringInput();

        // Reverse each word in the sentence and display the result
        String reversedSentence = reverseEachWord(inputSentence);
        System.out.println("Result after reversing each word: " + reversedSentence);

        // Close the scanner to prevent resource leak
        closeScanner();
    }

    // Function to read a string input
    public static String getStringInput() {
        return scanner.nextLine();
    }

    // Function to reverse each word in a sentence
    public static String reverseEachWord(String input) {
        // Split the sentence into words
        String[] words = input.split("\\s+");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }

        // Join the reversed words back into a sentence
        return String.join(" ", words);
    }

    // Function to reverse a string
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int i = 0, j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        return new String(charArray);
    }

    // Function to close the scanner
    public static void closeScanner() {
        scanner.close();
    }
}
