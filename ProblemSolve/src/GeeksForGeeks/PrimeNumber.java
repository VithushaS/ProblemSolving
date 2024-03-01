package GeeksForGeeks;

public class PrimeNumber {
    static int isPrime(int N) {
    int i=2;
        if(N==0||N==1){
            return 0;
        }
        while (i<N){
         if(N%i==0){
            return 0;
        }
        i++;
    }
    return 1;
//        if (N <= 1) {
//            return 0; // Numbers less than or equal to 1 are not prime
//        }
//        for (int i = 2; i <= Math.sqrt(N); i++) {
//            if (N % i == 0) {
//                return 0; // If divisible by any number from 2 to sqrt(N), it's not prime
//            }
//        }
//        return 1;
    }
    public static void main(String[] args){
        int N=25;
        System.out.print(isPrime(N));
    }
}
