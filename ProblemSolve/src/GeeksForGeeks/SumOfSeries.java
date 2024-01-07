package GeeksForGeeks;

public class SumOfSeries {
    public static void main(String[]args){
        int n=10;
        SumOfSeries sumOfSeries=new SumOfSeries();
        System.out.print(sumOfSeries.seriesSum(n));
    }
    long seriesSum(int n) {
        long sum =(long)n*(n+1)/2;
        return sum;
    }
}
