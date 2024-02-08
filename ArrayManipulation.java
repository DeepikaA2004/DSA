public class ArrayManipulation {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 2; // Example value of n
        manipulateArray(a, n);
        System.out.print("Manipulated array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void manipulateArray(int[] arr, int n) {
        while (n > 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            n--;
        }
    }
}
