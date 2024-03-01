package GeeksForGeeks;

public class CheckLeapYear {
    static void isLeapYear(int year){
        if(year%4==0){
            // if the year is century
            if(year%100==0){
                if(year%400==0){
                    System.out.print("this is leap year");
                }else System.out.print("this is not leap year");
            }else System.out.print("this is leap year");
        }else System.out.print("this is not leap year");
    }
    public static void main(String[] args){
        int year = 2023;
        isLeapYear(year);
    }
}
