package GeeksForGeeks;

public class PrintsElementsOfArray {
    void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");

        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int n= arr.length;
        PrintsElementsOfArray printsElementsOfArray = new PrintsElementsOfArray();
        printsElementsOfArray.printArray(arr,n);
    }
}
