package GeeksForGeeks;
/*
You are given an integer N, reverse the digits of given number N,
ensuring that the reversed number has no leading zeroes. Return the resulting reversed number.
 */

public class ReverseDigits {
    public static long reverse_digit(long n){
        long no2=n;
        long rem=0;
        while(n>0){
            rem = (rem*10) + n%10;
            n = n/10;
        }
        return rem;
    }
    public static void main(String[] args){
        long n =200;
        System.out.print(reverse_digit(n));

    }
}
