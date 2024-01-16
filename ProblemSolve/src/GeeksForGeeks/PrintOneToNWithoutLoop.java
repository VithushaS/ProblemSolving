package GeeksForGeeks;
/*
Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
 */
public class PrintOneToNWithoutLoop {

    static void printNumbers(int number){
        if(number<=0){
            return;
        }
        else
            printNumbers(number - 1);
        System.out.print(number+" ");
    }

    public static void main(String[] args) {
        int number = 5;
        printNumbers(number);
    }
}
