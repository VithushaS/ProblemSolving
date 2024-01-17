package GeeksForGeeks;

import java.util.HashSet;

/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of
 elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
If there are repetitions, then only one occurrence of element should be printed in the union.
Note : Elements are not necessarily distinct.
Example 1:
Input:
5 3
1 2 3 4 5
1 2 3
Output:
5
 */
public class UnionOfTwoArrays {
    public static int union(int a[], int n, int b[], int m){
     HashSet<Integer> s = new HashSet<>();
     for(int i=0;i<n;i++){
         s.add(a[i]);
     }
     for(int i=0;i<m;i++){
         s.add(b[i]);
     }
     return (s.size());
    }
    public static void main(String[] args){
        int n=3;
        int m=5;
        int[] a={1,2,3};
        int[] b={1,2,9,6,5};
        System.out.print(union(a,n,b,m));
    }
}
