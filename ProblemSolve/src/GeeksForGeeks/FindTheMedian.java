package GeeksForGeeks;

import java.util.Arrays;
/*
Example 1:
Input: N = 5
arr[] = 90 100 78 89 67
Output: 89 Explanation: After sorting the array
middle element is the median
Example 2:
Input: N = 4
arr[] = 56 67 30 79
Output: 61 Explanation: In case of even number of
elements, average of two middle elements
is the median.
 */
public class FindTheMedian {
    public static int median(int[] v){
        int mid;
        int n = v.length;
        Arrays.sort(v);
        if(n%2==0){
            mid = n/2;
            return ((v[mid] +v[mid-1])/2);
        }else {
            mid = n/2;
            return v[mid];
        }
    }
    public static void main(String[] args){
        int N=3;
        int[] v={2,1,4};
        System.out.print(median(v));
    }
}
