/* given N towers with heights
and a positive integer k modify each tower bu increasing or decresing by k only once
and then find the min difference between the heigths of longest and shortest tower*/
import java.util.*;
public class DS8MinimizeTheHeights{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NUMBER OF THE TOWERS");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE HEIGHTS OF THE TOWER");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("ENTER THE K VALUE");
        int k=s.nextInt();
        minheights(a,n,k);
    }
    public static void minheights(int a[],int n,int k){
        Arrays.sort(a, 0, n);       //sorting the array
        int mini=a[0];
        int maxi=a[n-1];
        int mindiff=maxi-mini;
        for(int i=1;i<n;i++){
            maxi=Math.max(a[i-1]+k,a[n-1]-k);       //incresing the previous element 
            mini=Math.min(a[i]-k,a[0]+k);           //decresing the current element
            if(mini>=0){    //we have to neglect the negetive cases as tower heights cannot be negetive
                mindiff=Math.min(mindiff, maxi-mini);
            }
        }
        System.out.println("THE MINIMUM DIFFERENCE BETWEEN THE HEIGHTS IS :"+ mindiff);
    }
}