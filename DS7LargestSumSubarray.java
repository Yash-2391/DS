/*prints the largest summ of the sub array */
import java.util.*;
class DS7LargestSumSubarray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRY");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("BRUTE FORCE SOLUTION");
        LargeSum(a,n);
        System.out.println("SOLUTION USING KADANES ALGO");
        KadaneAlgo(a,n); //Efficient Solution...
    }
    public static void LargeSum(int a[],int n){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println("THE MAX SUM IS "+maxsum);
    }
    public static void KadaneAlgo(int a[],int n){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum+=a[i];
            maxsum=Math.max(maxsum,cursum);
            if(cursum<0){
                cursum=0;
            }
        }
        System.out.println("THE MAX SUM IS "+maxsum);
    }
}