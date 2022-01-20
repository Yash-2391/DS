/*create a linked list without using LinkedList class in java*/
import java.util.*;
class Node{
    private int data;
    private Node next;
    Node(){
        data=0;
        next=null;
    }
    Node(int d,Node n){     //node constructer
        data=d;
        next=n;
    }
    // we are using this getter and setters because we have made data and next as private

    public int getData() {      //a getter for data
        return data;
    }
    public Node getNext() {     //a getter for next 
        return next;
    }
    public void setData(int data) {     //use to set value for data
        this.data = data;
    }
    public void setNext(Node next) {      //use to set value for next
        this.next = next;
    }
}
class LinkedList{
    int size=0;
    Node head=null;
    public boolean isEmpty(){
        if(head==null)
            return true;
        else
            return false;
    }
    public int getListSize(){
        return size;
    }
    public void viewlist(){
        Node temp;
        temp=head;
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }
        else{
            System.out.println("THE LIST IS: ");
            while(temp!=null){
                System.out.print(temp.getData()+" ");
                temp=temp.getNext();
            }
            System.out.println();
        }
    }
    public void insertAtStart(int val){
        Node n=new Node();
        n.setData(val);
        n.setNext(head);
        head=n;
        size++;
    }
    public void insertAtEnd(int val){
        if(isEmpty()){
            insertAtStart(val);
        }
        else{
            Node n=new Node();
            n.setData(val);
            Node temp=head;
            while(temp.getNext()!=null)
                temp=temp.getNext();
            temp.setNext(n);
            size++;    
        }        
    }
    public void insertAtPos(int val,int pos){
        if(isEmpty()||pos==1){
            insertAtStart(val);
        }
        else if(pos==(size+1)){
            insertAtEnd(val);
        }
        else if(pos>1 && pos<=size){
            Node n=new Node();
            n.setData(val);
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
            size++;
        }
        else{
        System.out.println("INVALID POSITION");
        }        
    }
    public void deleteFromStart(){
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }
        else{
            head=head.getNext();
            size--;
        }
    }
    public void deleteFromEnd(){
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }
        else if(size==1){
            deleteFromStart();
        }
        else{
            Node temp=head;
            for(int i=1;i<size-1;i++)
                temp=temp.getNext();
            temp.setNext(null);
            size=size-1;
        }
    }
    public void deleteFromPos(int pos){
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }
        else if(pos==1)
            deleteFromStart();
        else if(pos==size)
            deleteFromEnd();
        else if(pos>1 && pos<size){
            Node temp1,temp;
            temp=head;
            for(int i=1;i<pos-1;i++)
                temp=temp.getNext();
            temp1=temp.getNext();
            temp.setNext(temp1.getNext());
            size--;
        }
        else
            System.out.println("INVALID POS");
    }
}
class Driver{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int ch=0;
        while(ch!=-1){
            System.out.println("THE OPTIONS ARE");
            System.out.println("-1. TO EXIT");
            System.out.println("1. INSERT AT START");
            System.out.println("2. INSERT AT END");
            System.out.println("3. INSERT AT SPECIFIC POSITON");
            System.out.println("4. DELETE FROM START");
            System.out.println("5. DELETE FROM END");
            System.out.println("6. DELETE FROM SPECIFIC POSITION");
            System.out.println("7. VIEW LIST");
            System.out.println("ENTER YOUR CHOICE");
            ch=s.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    System.out.println("ENTER THE DATA YOU WANT TO INSERT");
                    int val=s.nextInt();
                    list.insertAtStart(val);
                    System.out.println("ELEMENT INSERTED AND THE LIST IS: ");
                    list.viewlist();
                    break;
                }
                case 2:{
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    System.out.println("ENTER THE DATA YOUT WANT TO INSERT");
                    int val=s.nextInt();
                    list.insertAtEnd(val);
                    System.out.println("ELEMENT INSERTED AND THE LIST IS: ");
                    list.viewlist();
                    break;
                }
                case 3:{
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    System.out.println("ENTER THE DATA YOUT WANT TO INSERT");
                    int val=s.nextInt();
                    System.out.println("ENTER THE POSITION AT WHICH YOUT WANT TO INSERT");
                    int pos=s.nextInt();
                    list.insertAtPos(val, pos);
                    System.out.println("ELEMENT INSERTED AND THE LIST IS: ");
                    list.viewlist();
                    break;
                }
                case 4:{
                    list.deleteFromStart();
                    System.out.println("ELEMENT DELETED AND THE LIST IS: ");
                    list.viewlist();
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    break;
                }
                case 5:{
                    list.deleteFromEnd();
                    System.out.println("ELEMENT DELETED AND THE LIST IS: ");
                    list.viewlist();
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    break;
                }
                case 6:{
                    System.out.println("ENTER THE POSITION OS THE ELEMENT YOU WANT TO DELETE");
                    int pos=s.nextInt();
                    list.deleteFromPos(pos);
                    System.out.println("ELEMENT DELETED AND THE LIST IS: ");
                    list.viewlist();
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    break;
                }
                case 7:{
                    System.out.println("THE SIZE OF THE LIST IS: "+ list.getListSize());
                    System.out.println("THE LIST IS: ");
                    list.viewlist();
                    break;  
                }
                default:{
                    System.out.println("SOMETHING WENT WRROOOOONG :( ");
                    break;
                }
            }    
        }
    }
}