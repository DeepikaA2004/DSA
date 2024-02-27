import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        System.out.print("Duplicates: ");
        findDuplicates(arr);
    }
}

/*
 * The above solution is O(N)
 * The same problem is solved by O(1) :
 * i-->o-->N-1
 * index = a[i]%n
 * a[i]+=n
 */