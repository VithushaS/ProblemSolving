package GeeksForGeeks;

public class Reverse {
    public static void main(String[] args){
        String s="vithu";
        System.out.println(reverStri(s));
    }
    public static String reverStri(String s){
        if(s.isEmpty()){
            return s;
        }else {
            System.out.print(s.charAt(s.length()-1));
            return reverStri(s.substring(0,s.length()-1));
        }
    }
}
