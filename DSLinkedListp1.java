/**MAKE A LINKED List add elements in it and search for number and display its position */
import  java.util.*;
class DSLinkedListp1{
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
        System.out.println("ENTER THE SEARCH VALUE");
        int key=s.nextInt();
        for(int i=0;i<n;i++){
            if(l.get(i)==key)
                System.out.println("ELEMENT IS PRESENT AT POSITION "+ (i+1));
        }
    }
}