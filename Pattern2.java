import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid pattern: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            // Inner loop for space
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Inner loop for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
