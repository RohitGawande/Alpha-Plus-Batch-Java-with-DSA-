public class LinkedList4 {
public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=next;
    }
    
}
public static Node head;
public static Node tail;
public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
   
    tail.next=newNode;
    tail=newNode;
}
}