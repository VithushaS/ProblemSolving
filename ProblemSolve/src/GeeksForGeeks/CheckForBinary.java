package GeeksForGeeks;
/*
Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
Input:str = 101 Output:1
Explanation:Since string contains only 0 and 1, output is 1.
Input:str = 75 Output:0
Explanation:Since string contains digits other than 0 and 1, output is 0.
 */
public class CheckForBinary {
   static boolean isBinary(String str){
        boolean result=true;
        char ch ;
        int n = str.length();
        for(int i=0;i<n;i++){
            ch = str.charAt(i);
            if(ch == '0' || ch=='1'){
                 result = true;
            }else {
                result = false;
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str="120";
        System.out.print(isBinary(str));
    }
}
