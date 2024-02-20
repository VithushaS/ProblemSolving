package GeeksForGeeks;


import java.util.Arrays;
/*
Given an array Arr of size N, print the second largest distinct element from an array.
If the second largest element doesn't exist then return -1.
Input: N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34

Input: N = 3
Arr[] = {10, 5, 10}
Output: 5

 */

public class SecondLargestDistinct {
  static int print2largest(int arr[], int n) {

        Arrays.sort(arr);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 12, 12 };
        int n = arr.length;
        System.out.print(print2largest(arr,n));
    }
}
