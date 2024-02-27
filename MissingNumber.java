public class MissingNumber {
    public static int MissingNumber(int[] arr, int N) {
        int total = (N * (N + 1)) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int N = 5;
        System.out.println(MissingNumber(arr, N));

    }
}
