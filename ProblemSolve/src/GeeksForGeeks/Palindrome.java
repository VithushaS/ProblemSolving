package GeeksForGeeks;
/*
Given an integer, check whether it is a palindrome or not.
 */
public class Palindrome {
    public String is_palindrome(int n)
    {
        int no2=n;
        int rem=0;
        while(n>0){
            rem = (rem*10) + n%10;
            n=n/10;
        }
        if(no2==rem){
            return "Yes";
        }
        else return "No";
    }
    public static void main(String [] args){
        int n=123;
        Palindrome palindrome = new Palindrome();
        System.out.print(palindrome.is_palindrome(n));
    }
}
