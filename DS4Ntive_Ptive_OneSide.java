/*
move all positive numbers to one side and negetive to other side in the array
*/ 
import java.util.*;
class DS4Ntive_PTive_OneSide{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRY");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        MoveElements(a,n);
    }
    public static void MoveElements(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                int j=i;
                while(a[j]>=0 && j<n-1){
                    j++;
                }
                if(a[j]<0)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                i=j;
            }
        }
        System.out.println("THE NEW ARRAY IS:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}