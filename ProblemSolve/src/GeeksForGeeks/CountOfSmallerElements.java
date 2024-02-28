package GeeksForGeeks;
/*
Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.
Input:N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9 Output:5
 */
public class CountOfSmallerElements {
    public static int countOfElements(int []arr,int n,int x)
    {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int[] arr={1,2,2,3,4};
        int n= arr.length;
        int x= 2;
        System.out.print(countOfElements(arr,n,x));
    }
}
