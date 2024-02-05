import java.util.Scanner;

public class Pattern3 {
    public static void printPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print decreasing numbers (excluding the first one)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the number of rows
        System.out.print("Enter the number of rows for the pyramid pattern: ");
        int rows = scanner.nextInt();

        // Call the method to print the pyramid pattern
        printPyramidPattern(rows);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}
