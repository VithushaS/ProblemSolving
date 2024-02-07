package GeeksForGeeks;
/*
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.
 */
import java.util.ArrayList;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> lead=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                lead.add(arr[i]);
            }
        }
    return lead;
    }
//    int max=-1;
//        for(int i = n-1;i>=0;i--){
//        if(arr[i]>=max){
//            list.add(arr[i]);
//            max = arr[i];
//        }
//    }
//        Collections.reverse(list);
//        return list;

    /* Driver program to test above functions */
    public static void main(String[] args)
    {

        int arr[] = new int[]{16, 17, 5, 2};
        int n = arr.length;
        ArrayList<Integer> leaderslist= leaders(arr,n);
        for(int leader : leaderslist){
            System.out.print(leader+" ");
        }

    }
}
