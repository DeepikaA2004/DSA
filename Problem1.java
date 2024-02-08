import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 2;
        manipulateArray(a, n);
        System.out.println("Manipulated array: " + Arrays.toString(a));
    }

    public static void manipulateArray(int[] arr, int n) {
        int length = arr.length;
        if (n < 0 || n >= length)
            System.out.println("Invalid value of n.");
        return;
    }

    private int length;
    int[] temp = new int[length];for(
    int i = 0;i<length;i++)
    {
        temp[i] = arr[(i + n) % length];
    }System.arraycopy(temp,0,arr,0,length);
}}
