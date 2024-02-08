
// one array is provided that array consists of duplicate elements remove the duplicate elements without change in the order using java
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = { 3, 5, 2, 7, 5, 8, 3, 9, 2 }; // Example array with duplicates

        removeDuplicates(array);

        // Print the array after removing duplicates
        System.out.println("Array without duplicates:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void removeDuplicates(int[] array) {
        // Boolean array to keep track of seen elements
        boolean[] encountered = new boolean[array.length];
        // Iterate through the array
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            // If the current element has not been encountered before
            if (!encountered[array[i]]) {
                // Mark the element as encountered
                encountered[array[i]] = true;
                // Move the element to the new index
                array[newIndex] = array[i];
                newIndex++;
            }
        }
        // Trim the array to remove elements after the new index
        array = Arrays.copyOf(array, newIndex);
    }
}
