package GeeksForGeeks;

import java.util.ArrayList;
/*
Given an unsorted array A of size N that contains only non negative integers,
find a continuous sub-array that adds to a given number S and return
the left and right index(1-based indexing) of that subarray.
In case of multiple subarrays, return the subarray indexes which come first on
moving from left to right.
Note:- You have to return an ArrayList consisting of two elements left and right.
In case no such subarray exists return an array consisting of element -1.
Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.
 */
public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> al = new ArrayList<>();
        boolean found = false;
        int st = 0;
        int end = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum = sum + arr[i];

            if(sum >= s){
                end= i;
                while(sum >s && st<end){
                    sum = sum - arr[st];
                    st++;
                }
            }
            if(sum == s){
                al.add(st+1);
                al.add(end+1);
                found = true;
                break;
            }
        }
        if(!found){
            al.add(-1);
        }
        return al;

    }
    public static void main(String[]args){
int n=5;
int[] arr={1,2,3,7,5};
int s=12;

System.out.print(subarraySum(arr,n,s));
    }
}
