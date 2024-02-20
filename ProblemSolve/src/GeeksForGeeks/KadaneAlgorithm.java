package GeeksForGeeks;

public class KadaneAlgorithm {
   static long maxSubarraySum(int arr[], int n){
        long max= Integer.MIN_VALUE;
        long currentMax=0;
        for(int i=0;i<n;i++){
            long temp = currentMax + arr[i];
            if(temp<arr[i]){
                currentMax = arr[i];
            } else {
                currentMax=temp;
            }
            if(max<currentMax){
                max=currentMax;
            }
        }
     return max;
    }
    public static void main(String[] args){
       int[] arr={7,-1,-6,4,3,8};
       int n=arr.length;
       System.out.print(maxSubarraySum(arr,n));
    }
}
