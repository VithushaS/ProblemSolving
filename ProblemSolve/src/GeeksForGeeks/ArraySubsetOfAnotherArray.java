package GeeksForGeeks;

import java.util.Arrays;
/*Input: a1[] = {1, 2, 3, 4, 4, 5, 6} a2[] = {1, 2, 4}
Output:Yes Explanation: a2[] is a subset of a1[]
Input:a1[] = {10, 5, 2, 23, 19} a2[] = {19, 5, 3}
Output: No
Explanation: a2[] is not a subset of a1[]
 */
public class ArraySubsetOfAnotherArray {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        if (a1 == null || a2 == null)
            return "No";

        Arrays.sort(a1);
        Arrays.sort(a2);

        int i = 0, j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] == a2[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return (j == a2.length)?"Yes":"No";
    }
    public static void main(String[] args){
        long[]a1={1,2,3,4,4,5};
        long n=a1.length;
        long[] a2={1,3,9};
        long m= a2.length;
        System.out.print(isSubset(a1,a2,n,m));
    }
}
