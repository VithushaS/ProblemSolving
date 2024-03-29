package GeeksForGeeks;
/*
You are given a number N. You need to print the pattern for the given value of N.
For N = 2 the pattern will be
2 2 1 1
2 1
For N = 3 the pattern will be
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
Note: Instead of printing a new line print a "$" without quotes.
 After printing the total output, end of the line is expected.
Input: 2
Output:
2 2 1 1 $2 1 $
Input: 3
Output:
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
 */

public class PrintThePattern {
    void pattern(int n){

        int i, j, k;

        for (k = n; k >=1; k--) {
            for (i = n; i > 0; i--) {
                for (j = 0; j < k; j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("$");
        }


    }
    public static void main(String[] args){
        int n=2;

        PrintThePattern printThePattern=new PrintThePattern();
        printThePattern.pattern(n);
    }
}
