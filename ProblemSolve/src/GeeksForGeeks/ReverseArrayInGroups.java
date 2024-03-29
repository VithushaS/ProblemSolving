package GeeksForGeeks;

import java.util.ArrayList;
/*
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray
(irrespective of its size). You shouldn't return any array, modify the given array in-place.
Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 Example 2:
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 */
public class ReverseArrayInGroups {
    static void reverse(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverse(arr, 5, 3);
        System.out.println(arr);
    }
}
