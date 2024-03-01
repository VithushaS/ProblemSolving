package GeeksForGeeks;

public class PalindromeString {
   static int isPalindrome(String S) {
    int n= S.length() -1;
    for(int i=0;i<n;i++){
        if(S.charAt(i)!=S.charAt(n)){
            return 0;
        }
        n--;
    }
    return 1;

//    String newS = "";
//    for(int i=n;i>=0;i--){
//        newS +=S.charAt(i);
//    }
//    if(S.equals(newS)){
//        return 1;
//    }else return 0;
    }
    public static void main(String[] args){
        String S="abbc";
        System.out.print(isPalindrome(S));
    }
}
