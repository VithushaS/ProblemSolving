package GeeksForGeeks;

import java.util.Arrays;

public class CheckTwoArraysEqual {
    public static boolean check(long A[],long B[],int n){
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<n;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
//        if(Arrays.equals(A,B)){
//            return true;
//        }
//        return false;
    }
    public static void main (String[]args){
        int n=3;
        long[] A={2,2,4};
        long[] B={2,4,2};
        System.out.print(check(A,B,n));
    }
}
