/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

*/
import java.util.*;
public class DS9DuplicateNumber{
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
        duplicates(a,n);
    }   
    public static void duplicates(int a[],int n){
        Arrays.sort(a,0,n);
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                System.out.println("THE DUPLICATE NUMBER IS " + a[i]);
            }
        }
    }
}