/*here we have to sort array of 0,1,2 without using any sort algorithm
input -> {0,2,1,0,2,1}
output -> {0,0,1,1,2,2}
*/
import java.util.*;
class DS3sort012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        n=s.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        nosort(a,n);
    }  
    public static void nosort(int a[],int n){
        int czero=0,cone=0,ctwo=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                czero++;
            else if(a[i]==1)
                cone++;
            else if(a[i]==2)
                ctwo++;
        }
        System.out.println(czero);
        System.out.println(cone);
        System.out.println(ctwo);
        int k=0;
        while(k<czero){
            a[k]=0;
            k++;
        }
        while(k<(cone+czero)){
            a[k]=1;
            k++;
        }
        while(k<(czero+cone+ctwo)){
            a[k]=2;
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
