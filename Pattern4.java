public class Pattern4 {
    public static void main(String[] args) {
        int n = 3; // Change this value to print the pattern for different values of N

        // Print the upper half of the fish
        for (int i = 1; i <= n; i++) {
            // Print the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the left side of the triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Print the stars between the triangles
            if (i != 1) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        // Print the middle line of the fish
        for (int i = 1; i <= 2 * n + 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the lower half of the fish
        for (int i = n; i >= 1; i--) {
            // Print the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the left side of the triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Print the stars between the triangles
            if (i != n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}