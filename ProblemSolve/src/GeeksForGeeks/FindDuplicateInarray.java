package GeeksForGeeks;

import java.util.ArrayList;

public class FindDuplicateInarray {
    public static void main(String[] args) {
        int N1 = 5;
        int[] arr = {12, 3, 1, 12,1};
        System.out.println(duplicates(arr, N1));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(-1);
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int []count=new int[max+1];
        for(int i=0;i<max+1;i++)
        {
            count [i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            if(count[i]>1)
            {
                a.add(i);
            }

        }
        if(a.isEmpty()){
            return b;
        }
        else{
            return a;
        }

    }
}
