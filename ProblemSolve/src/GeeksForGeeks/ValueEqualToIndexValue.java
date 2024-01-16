package GeeksForGeeks;

import java.util.ArrayList;

/*
Given an array Arr of N positive integers. Your task is to find the elements
whose value is equal to that of its index value ( Consider 1-based indexing ).
Note: There can be more than one element in the array which have the same value as its index.
You need to include every such element's index. Follows 1-based indexing of the array.
Example 1:
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:
Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
 */
public class ValueEqualToIndexValue {
    ArrayList<Integer> equalToIndex(int arr[], int n) {
        ArrayList<Integer> value = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                value.add(i+1);
            }
        }
        return value;
    }
    public static void main(String[]args){
        int n =5;
        int[] arr={4,5,3,7,9};
        ValueEqualToIndexValue valueEqualToIndexValue = new ValueEqualToIndexValue();
        System.out.print(valueEqualToIndexValue.equalToIndex(arr,n));
    }
}
