package GeeksForGeeks;

public class GCDOfTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int a=3;
        int b=6;
        System.out.print(gcd(a,b));
    }
}
