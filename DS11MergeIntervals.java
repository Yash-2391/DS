/*given a matrix array merge the overlapping pair into one pair
 */
import java.util.*;
class DS11MergeIntervals{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        n=s.nextInt();
        int a[][]=new int[n][2];
        System.out.println("ENTER THE ARRAY PAIR BY PAIR");
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("THE MERGED INTERVAL ARRAY IS:");
        mergeIntervals(a,n);
    }
    public static void mergeIntervals(int a[][],int n){
        int maxi=0;
        Arrays.sort(a,(p,q)->Integer.compare(p[0], q[0]));
        int i=0,k=0,j=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(i<n){
            l.add(a[i][0]);
            for(j=i;j<n-1;j++){
                if(a[j][1]>=a[j+1][0])
                    continue;
                else{
                    l.add(a[j][1]);
                    break;
                }
            }            
            maxi=Math.max(maxi,a[i][1]);
            i=j+1;
           
        }
        l.add(Math.max(maxi,a[n-1][1]));
        int b[][]=new int[(l.size())/2][2];
        int m=0;
        for(int x=0;x<b.length;x++){
            for(int y=0;y<2;y++){
                b[x][y]=l.get(m++);
            }
        }
        for(int x=0;x<b.length;x++){
            for(int y=0;y<2;y++){
                System.out.print(b[x][y]+" ");
            }
            System.out.println();
        }
    }
}
