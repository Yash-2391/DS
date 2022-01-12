/*
input -> {8,97,5,63,2,4}
find the 3rd smallest in the array
output -> 5
*/
import java.lang.reflect.Array;
import java.util.*;
public class DS2ksmallestelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("ENTER THE Kth VALUE LESS THAN OR EQUAL TO THE SIZE OF THE ARRAY");
        int k=s.nextInt();
        if(k<=n&&k>0)
            System.out.println("THE "+k+" SMALLEST ELEMENT IS "+ksmall(a,n,k));
        else
            System.out.println("INVALID K VALUE");
    }   
    public static int ksmall(int a[],int n,int k){
        Arrays.sort(a);
        return(a[k-1]);
    }
}
