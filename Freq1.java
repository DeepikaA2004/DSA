public class Freq1 {
    public static void findDuplicates(int[] arr) {
        int n = arr.length;
        System.out.print("Duplicates: ");
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 2 * n) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        findDuplicates(arr);
    }
}
