package GeeksForGeeks;

public class CheckWhethercharacterIsAlphabet {
    public static void main(String[] args) {
        char c= 'b';
        if(c>='a' && c<='z' ||c>='A' && c<='Z'){
            System.out.println(c + " is an alphabet.");
        }else System.out.println(c + " is not an alphabet.");
    }
}
