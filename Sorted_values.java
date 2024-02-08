// // 

// import java.util.Arrays;

// public class Sorted_values {
//     public static void main(String[] args) {
//         int[] array = { 1, 2, 1, 3, 2, 2, 4, 5 };
//         int num = 4;
//         Arrays.sort(array);

//         int[] positions = findIndexPositions(array, num);
//         System.out.println("Index positions of " + num + ": " + Arrays.toString(positions));
//     }

//     public static int[] findIndexPositions(int[] arr, int num) {
//         int start = -1;
//         int end = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == num) {
//                 if (start == -1) {
//                     start[0] = i;
//                 }
//                 else{
//                     start[1] =i;

//                 }
//                 end = i;
//             }
//         }
//         return new int[] { start, end };
//     }
// }

// import java.util.Arrays;

// public class Sorted_values {
//     public static void main(String[] args) {
//         int[] array = {1, 2, 1, 3, 2, 2, 4, 5};
//         int num = 4; // Example value of num

//         int[] positions = findIndexPositions(array, num);
//         System.out.println("Index positions of " + num + ": " + Arrays.toString(positions));
//     }

//     public static int[] findIndexPositions(int[] arr, int num) {
//         Arrays.sort(arr); // Sort the array

//         int start = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == num) {
//                 if (start == -1) {
//                     start = i;
//                 }
//                 if (i > 0 && arr[i] == arr[i - 1]) {
//                     // Skip if current element is same as previous (duplicate element)
//                     continue;
//                 }
//                 return new int[]{start, -1};
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }
// if the unsorted array is given with duplicate values. remove the duplicate elements and sorted the array eg: given array ={1,2,1,2,2,3,4,5,7} after sorting it change into 1,2,3,4,5,7 if the user given value= 5 it returns the index position of the value in the sorted array, if the user value is given 6 there is no value 6 is present in the array we are supposed to return the index array where it is should be present

import java.util.Arrays;

public class Sorted_values {
    public static void main(String[] args) {
        int res[] = { -1, -1 };
        int arr[] = { 1, 2, 1, 3, 2, 2, 4, 5 };
        Arrays.sort(arr);
        int target = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (res[0] == -1) {
                    res[0] = i;
                } else {
                    res[1] = i;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}