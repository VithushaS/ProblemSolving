package GeeksForGeeks;

public class SwapKthElements {
    public static void swapKth(int n, int k, int[] arr) {
       int tem = arr[k-1];
       arr[k-1]=arr[n-k];
       arr[n-k]=tem;

    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int n=arr.length;
        int k=3;
        swapKth(n,k,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
