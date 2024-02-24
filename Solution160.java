import java.util.Scanner;

public class Solution160 {
    public int findSingleDigitSum(int N, int K) {

        int repeatedLength = N * K;

        char[] repeatedCharArray = String.valueOf(repeatedLength).toCharArray();

        int sum = 0;
        for (char digit : repeatedCharArray) {
            sum += Character.getNumericValue(digit);
        }
        while (sum >= 10) {
            int tempSum = 0;
            while (sum != 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();

        Solution solution = new Solution();
        int singleDigitSum = solution.findSingleDigitSum(N, K);

        System.out.println("Output: " + singleDigitSum);

        scanner.close();
    }
}
