public class ArrayManipulation1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 2;

        manipulateArray(a, n);

        System.out.print("Manipulated array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void manipulateArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length;

        while (n > 0) {
            int temp = arr[length - 1];
            for (int i = length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            n--;
        }
    }
}
