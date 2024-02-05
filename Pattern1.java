import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the patterns: ");
        int n = scanner.nextInt();

        // Square Pattern
        System.out.println("Square Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        // Left-ward Triangle Upwards
        System.out.println("\nLeft-ward Triangle Upwards:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Rightward Triangle Upwards
        System.out.println("\nRightward Triangle Upwards:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces for rightward alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Downwards Left Triangle
        System.out.println("\nDownwards Left Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Downwards Right Triangle
        System.out.println("\nDownwards Right Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces for rightward alignment
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
