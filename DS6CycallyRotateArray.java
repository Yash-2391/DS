/*IT ROTEATES THE ARRAY ANTI CLOCK WISE AND CLOCK WISE BY ONE POSITION */
import java.util.*;
public class DS6CycallyRotateArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        anticlockwise(a,n);
        int m;
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        m=s.nextInt();
        int b[]=new int[m];
        System.out.println("ENTER THE ARRAY");
        for(int i=0;i<m;i++){
            b[i]=s.nextInt();
        }
        clockwise(b,m);
    }
    public static void anticlockwise(int a[],int n){
        int temp=a[0];
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");            
        }
        System.out.println();
    }
    public static void clockwise(int b[],int m){
        int temp=b[m-1];
        for(int i=m-1;i>=1;i--){
            b[i]=b[i-1];
        }
        b[0]=temp;
        for(int i=0;i<m;i++){
            System.out.print(b[i]+" ");            
        }
    }
}
