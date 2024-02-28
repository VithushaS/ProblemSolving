package GeeksForGeeks;
/*
Given an array, rotate the array by one position in clock-wise direction.
 Input:N = 5  A[] = {1, 2, 3, 4, 5}
Output:5 1 2 3 4
 */
public class CyclicallyRotateAnArrayByOne {
    public static void rotate(int arr[], int n)
    {
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        int n=arr.length;

        rotate(arr, n); // Rotate the array first
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Then print the rotated array
        }
    }
}
