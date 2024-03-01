package GeeksForGeeks;
/*
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.
 */
public class PrintFirstnFibonacciNumbers {
    public static long[] printFibb(int n){
        long[] fibNumbers=new long[n];
        long first =1;
        long secound =1;

        for(int i=0;i<n;i++){
            fibNumbers[i]=first;
            long third = first+secound;
            first = secound;
            secound=third;

        }
        return fibNumbers;
    }
    public static void main(String[] args){
        int n=5;
        long[] fibNumbers=printFibb(n);
        for(int i=0;i<n;i++){
            System.out.print(fibNumbers[i]+" ");
        }
    }
}
