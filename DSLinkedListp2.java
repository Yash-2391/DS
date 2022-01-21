import java.util.*;
/**TAKE elements and insert it into the linked list and delete all elements greater than key value */
public class DSLinkedListp2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();
        System.out.println("ENTER THE SIZE OF THE LINKED LIST");
        int n=s.nextInt();
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            l.add(x);
        }
        System.out.println(l);
        System.out.println("ENTER THE KEY VALUE");
        int key=s.nextInt();
        for(int i=l.size()-1;i>=0;i--){         //start from backward to avoid shift index problem... 
            if(l.get(i)>key)
                l.remove(i);
        }
        System.out.println("AFTER DELETION THE LIST IS");
        System.out.println(l);
    }
}
