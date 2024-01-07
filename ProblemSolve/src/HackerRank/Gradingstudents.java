package HackerRank;

import java.util.Scanner;

public class Gradingstudents {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i =0;i<n;i++) {
            int grade = obj.nextInt();
            if(grade>=38) {
                if(grade%5 >=3) {
                    int rem = grade%5;
                    grade += 5-rem;
                }
            }
            System.out.println(grade);
        }

    }
}
