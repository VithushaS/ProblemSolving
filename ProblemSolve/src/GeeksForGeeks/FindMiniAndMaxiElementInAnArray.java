package GeeksForGeeks;
/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
 */
//class Pair{
//    long first;
//    long second;
//    public Pair(long first,long second){
//        this.first=first;
//        this.second=second;
//    }
//}

import java.util.Arrays;

public class FindMiniAndMaxiElementInAnArray {
    static long[] getMinMax(long a[],long n){
        Arrays.sort(a);
        long min = a[0];
        long max = a[(int)(n - 1)];
        return new long[]{min,max};

    }
//    static Pair getMinMax(long a[], long n){
//        if(n==0){
//            return new Pair(Long.MIN_VALUE,Long.MAX_VALUE);
//        }
//        long min = Long.MAX_VALUE;
//        long max = Long.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(a[i]<min){
//                min = a[i];
//            }
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        return new Pair(min,max);
//    }
    public static void main(String[] args){
        long[] arr = { 1,20,2,50 };
        long arr_size = arr.length;
//        Pair minmax = getMinMax(arr, arr_size);
//        System.out.print(minmax.first+" "+minmax.second);
        long[] minmax = getMinMax(arr, arr_size);
        System.out.print(minmax[0]+" "+minmax[1]);
    }
}
