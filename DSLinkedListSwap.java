import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(){
        data=0;
        next=null;
    }
}
class Link{
    Node1 head;
    public void push(int val){
        Node1 n=new Node1();
        n.data=val;
        n.next=head;
        head=n;
    }
    public void printlist(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void swapNode(int x,int y){
        Node1 prevx,curx;
        prevx=null;
        curx=head;
        while(curx.data!=x && curx.next!=null){
            prevx=curx;
            curx=curx.next;
        }
        Node1 prevy,cury;
        prevy=null;
        cury=head;
        while(cury.data!=y && cury.next!=null){
            prevy=cury;
            cury=cury.next;
        }
        //Swapping previous elements of X
        if(prevx==null)
            head=cury;
        else    
            prevx.next=cury;
        
        //Swapping previous elements of Y
        if(prevy==null)
            head=curx;
        else    
            prevy.next=curx;
        //Swapping the nodes X and Y
        Node1 t=curx.next;
        curx.next=cury.next;
        cury.next=t;        
    }
}
public class DSLinkedListSwap{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Link list=new Link();
        System.out.println("ENTER THE SIZE");
        int n=s.nextInt();
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            list.push(x);
        }
        System.out.println("THE LIST IS");
        list.printlist();
        System.out.println("ENTER THE TWO ELEMENTS YOU WANT TO SWAP:");
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        list.swapNode(x,y);
        System.out.println("THE SWAPPED LIST IS:");
        list.printlist();



    }   
}