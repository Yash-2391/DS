/*
 Reverse a string and Array
 input -> {1,2,3,4,5}
 Output -> {5,4,3,2,1}
 
 input -> xyz
 output -> zyx
*/
import java.util.*;
public class DS1ReverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str=s.nextLine();
        stringrev(str);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRY");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        arrayrev(a,n);
    }
    public static void stringrev(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("THE REVERSE OF THE STRING IS:");
        System.out.println(rev);

    }
    public static void arrayrev(int a[],int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            end--;
            start++;
        }
        System.out.println("THE REVERSE OF THE ARRAY IS:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
