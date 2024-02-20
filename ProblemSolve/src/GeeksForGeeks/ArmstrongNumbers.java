package GeeksForGeeks;

import static java.lang.Math.pow;

/*
For a given 3 digit number, find whether it is armstrong number or not.
An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself.
Return "Yes" if it is a armstrong number else return "No".
 */
public class ArmstrongNumbers {
    static String armstrongNumber(int n) {
//        int temp = n;
//        int sum = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//             sum = sum + rem * rem * rem;
//        }
//        if(sum==temp){
//            return "Yes";
//        }else return "No";
        int digitCount=0;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            n /= 10;
            digitCount++;
        }
        n=temp;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
             sum +=pow(rem,digitCount) ;
        }
        if(sum==temp){
            return "Yes";
        }else return "No";

    }
    public static void main (String[] args){
        int n= 1635;
        System.out.print(armstrongNumber(n));
    }
}
