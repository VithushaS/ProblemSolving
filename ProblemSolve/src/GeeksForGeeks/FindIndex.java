package GeeksForGeeks;
/*
Given an unsorted array arr[] of n integers and a key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array )
and end index( index where the element is first found from right in the array ).(0 based indexing is used)
If the key does not exist in the array then return -1 for both start and end index in this case.
Input: n = 6
arr[] = { 1, 2, 3, 4, 5, 5 } key = 5
Output:  {4, 5}

 */
public class FindIndex {
    static int[] find(int[] arr, int n, int key){
        int start=-1;
        int end=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                start=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==key){
                end=i;
                break;
            }
        }
        return new int[]{start,end};
    }
    public static void main(String[] args){
        int[] arr={1,3,4,4,5,6};
        int n=arr.length;
        int key = 4;
        int[] result = find(arr, n, key);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
