public class MinPerfectSquare {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 17;
        int num3 = 10;

        System.out.println("Minimum number of perfect square numbers for " + num1 + ": " + minPerfectSquares(num1));
        System.out.println("Minimum number of perfect square numbers for " + num2 + ": " + minPerfectSquares(num2));
        System.out.println("Minimum number of perfect square numbers for " + num3 + ": " + minPerfectSquares(num3));
    }

    public static int minPerfectSquares(int n) {
        if (n <= 0)
            return 0;

        // Create an array to store the minimum number of perfect squares required
        int[] dp = new int[n + 1];

        // Initialize the array with maximum possible value
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Calculate the minimum number of perfect squares for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check for all perfect squares less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                // Update dp[i] if necessary
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        // Return the result for n
        return dp[n];
    }
}
