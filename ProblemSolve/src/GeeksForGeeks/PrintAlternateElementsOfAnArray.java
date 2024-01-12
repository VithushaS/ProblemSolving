package GeeksForGeeks;
/*
You are given an array A of size N. You need to print elements of A in alternate order
 (starting from index 0).
Example 1:Input:N = 4 ,A[] = {1, 2, 3, 4}
Output:
1 3
Example 2:Input: N = 5 ,A[] = {1, 2, 3, 4, 5}
Output:
1 3 5
 */
public class PrintAlternateElementsOfAnArray {
    public static void print(int[] arr, int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void main(String[]args){
        int n=5;
        int[] arr={1,2,3,4,5};
        print(arr,n);
    }
}
