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
        searchElement(l,key);
        System.out.println("THE LIST IS");
        for(int i : l){
            System.out.print(i+"->");
        }
        System.out.print("null");
        System.out.println();
        System.out.println("ENTER THE TWO ELEMENTS YOU WANT SWAP");
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        SwapList(l,x,y);

    }
    public static void searchElement(java.util.LinkedList<Integer> l,int key){
        for(int i=0;i<l.size();i++){
            if(l.get(i)==key){
                System.out.println("ELEMENT FOUND AT "+(i+1)+"th INDEX");
                break;
            }
        }
    } 
    public static void SwapList(java.util.LinkedList<Integer> l,int x,int y){
        int indx=l.indexOf(x);
        int indy=l.indexOf(y);
        l.set(indx,y);
        l.set(indy,x);
        System.out.println("THE SWAPPED LIST IS");
        for(int i : l){
            System.out.print(i+"->");
        }
        System.out.print("null");
        System.out.println();
    }
}