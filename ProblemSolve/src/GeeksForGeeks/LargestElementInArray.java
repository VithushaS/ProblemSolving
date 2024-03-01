package GeeksForGeeks;

import java.util.Arrays;

public class LargestElementInArray {
    public static int largest(int arr[], int n){
       // Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                    //without using tem variable
//                    arr[i]=arr[i]+arr[j];
//                    arr[j]=arr[i]-arr[j];
//                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args){
        int[] arr={2,1,3,6,5};
        int n= arr.length;
        System.out.print(largest(arr,n));
    }
}
