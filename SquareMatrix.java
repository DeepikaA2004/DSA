import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Print the square matrix
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
