package GeeksForGeeks;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    static int getPairsCount(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Count the frequency of each element in the array
        for (int num : arr) {
            int complement = K - num; // Find the complement required for the current number to form sum K
            if (map.containsKey(complement)) {
                count += map.get(complement); // Add the count of pairs with the complement number
            }
            map.put(num, map.getOrDefault(num, 0) + 1); // Update the frequency of the current number
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int N = arr.length;
        int K = 6;
        System.out.println(getPairsCount(arr, K));
    }
}
