package GeeksForGeeks;
/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
 */


public class ReverseString {
    public static String reverseWord(String str){
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args){
        String str = "hello";
        System.out.print(reverseWord(str));
    }
}
