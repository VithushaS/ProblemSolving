package GeeksForGeeks;

public class DisplayLongestName {
    public static String longest(int n, String[] names) {
        String longestName="";
        for(String name : names){
            if(name.length()>longestName.length()){
                longestName = name;
            }
        }
        return longestName;
    }
    public static void main(String[] args){
        String[] names={"Apple", "Mango", "Orange", "Banana"};
        int n= names.length-1;
        System.out.print(longest(n,names));
    }
}
