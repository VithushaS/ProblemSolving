package GeeksForGeeks;
/*
Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array.
Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2} Output: 3
Explanation:
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).
 */
public class EquilibriumPoint {
    public static int equilibrium(long arr[],int n){
    long rightsum =0;
    long leftsum=0;

    for(int i=0;i<n;i++){
        rightsum =rightsum+arr[i];
    }
    for(int j=0;j<n;j++){
        rightsum = rightsum - arr[j];
        if(leftsum==rightsum){
            return j+1;
        }else
            leftsum =leftsum+arr[j];
    }
    return -1;
    }
    public static void main(String[] args){
        int n=5;
        long[] arr={1,3,5,2,2};
        System.out.print(equilibrium(arr,n));
    }

}
