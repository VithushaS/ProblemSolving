package GeeksForGeeks;
/*
Given an integer array and another integer element. The task is to find if the given element is present in array or not.
Input:n = 4 arr[] = {1,2,3,4} x = 3 Output: 2
 If the element X does not exist in the array, the function should return -1.
 */
public class SearchAnElementInAnArray {
    static int search(int arr[], int N, int X)
    {
     for(int i=0;i<N;i++){
         if(arr[i]==X){
             return i;
         }
     }
return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        int n=arr.length;
        int X=2;
        System.out.print(search(arr,n,X));
    }
}
