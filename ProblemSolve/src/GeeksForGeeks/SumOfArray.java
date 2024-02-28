package GeeksForGeeks;
/*
Given an integer array arr[] of size n. The task is to find sum of it.
 */
public class SumOfArray {
    static int sum(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5};
        int n=arr.length;
        System.out.print(sum(arr,n));
    }
}
