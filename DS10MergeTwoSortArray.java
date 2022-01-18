/* Given two sorted arrays me have to merge the arrays and sort it without using extra space
a1={1,3,5,0}
a2={7,2,6,8,9}

must modify the array as:

a1={0,1,2,3}
a2={5,6,7,8,9}*/
import java.util.*;
class DS10MergeTwoSortArray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m;
        System.out.println("ENTER THE SIZE OF THE FIRST ARRAY");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("ENTER THE SIZE OF THE SECOND ARRAY");
        m=s.nextInt();
        int b[]=new int[m];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<m;i++){
            b[i]=s.nextInt();
        }
        SortArrays(a,n,b,m);
    }
    public static void SortArrays(int a[],int n,int b[],int m){
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a,0,n);
        Arrays.sort(b,0,m);
        System.out.println("THE MERGED SORTED ARRAY IS :");
        for(int x=0;x<n;x++){
            System.out.print(a[x]+" ");
        }
        for(int x=0;x<m;x++){
            System.out.print(b[x]+" ");
        }
    }
}