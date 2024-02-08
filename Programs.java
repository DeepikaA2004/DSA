import java.util.*;

public class Programs {

    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 1, 3, 4, 5, 7 };
        int searchValue = 6;

        // Sort the array
        Arrays.sort(array);

        // Search for the value in the sorted array
        int index = binarySearch(array, searchValue);

        if (index >= 0) {
            System.out.println("Index of " + searchValue + " in the sorted array: " + index);
        } else {
            // If value not found, find the index where it should be inserted
            int insertionPoint = -index - 1;
            System.out.println(searchValue + " should be inserted at index: " + insertionPoint);
        }
    }

    // Binary search implementation
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If element not found, return insertion point with negative sign
        return -(left + 1);
    }
}
