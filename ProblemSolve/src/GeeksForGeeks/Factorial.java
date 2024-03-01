package GeeksForGeeks;
/*
Given a positive integer, N. Find the factorial of N.
 */
public class Factorial {
    static long factorial(int N) {
     long fact=1;
     for(int i=1;i<=N;i++){
         fact *=i;
     }
     return fact;
    }
    public static void main(String[] args){
        int N=5;
        System.out.print(factorial(N));
    }
    }
