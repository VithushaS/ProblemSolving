package GeeksForGeeks;
/*
Given a string s. The task is to convert characters of string to lowercase.
 */
public class ConvertStringToLowerCase {
    static String toLower(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        String s= "ABCddE";
        System.out.print(toLower(s));
    }
}
