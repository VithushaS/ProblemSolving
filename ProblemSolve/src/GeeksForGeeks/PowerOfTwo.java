package GeeksForGeeks;
/*
Given a non-negative integer N. The task is to check if N is a power of 2. More formally,
 check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.
Example 1: Input: N = 8
Output: YES ,Explanation:
8 is equal to 2 raised to 3 (23 = 8).
Example 2: Input: N = 98 ,Output: NO
Explanation: 98 cannot be obtained by any power of 2.
 */
public class PowerOfTwo {
    public static boolean powOfTwo(long n){
    if(n==0){
        return false;
    }
    return (n&(n-1))==0;
    }
    public static void main(String[] args){
        long n = 81;
        if(powOfTwo(n)) {
            System.out.print("YES");
        }
        else System.out.print("NO");

    }
}
