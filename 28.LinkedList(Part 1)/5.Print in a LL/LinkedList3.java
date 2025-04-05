public class LinkedList3 {
class Node{
    int  data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=tail;
    tail=newNode;
}
public void printLL(){
    if(head==null){
        System.out.println("LL is Empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    LinkedList3 ll=new LinkedList3();
    ll.printLL();
    ll.addFirst(1);
    ll.printLL();
    ll.addFirst(2);
    ll.printLL();
    ll.addFirst(3);
    ll.printLL();
    ll.addLast(4);
    ll.printLL();
    ll.addLast(5);
    ll.printLL();
    ll.addLast(6);
    
}
}


