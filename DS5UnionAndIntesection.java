/*prints the union and intersection in the 2 sorted array*/
import java.util.*;
public class DS5UnionAndIntesection {
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
        union(a,n,b,m);     //using hash set...
        intersection(a,n,b,m);
    }
    public static void union(int a[],int n,int b[],int m){
        HashSet<Integer> u=new HashSet<>(); //hashset only allows distinct elements i.e union elements;
        for(int i=0;i<n;i++){
            u.add(a[i]);
        }
        for(int i=0;i<m;i++){
            u.add(b[i]);
        }
        System.out.println("THE UNION OF ARRAY A AND B IS:");
        System.out.println(u);
    }
    public static void intersection(int a[],int n,int b[],int m){
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<n;i++){
            h1.add(a[i]);
        }
        for(int i=0;i<m;i++){
            h2.add(b[i]);
        }
        h1.retainAll(h2);
        System.out.println("THE INTERSECTION OF ARRAY A AND B IS:");
        System.out.println(h1);
    }
}
