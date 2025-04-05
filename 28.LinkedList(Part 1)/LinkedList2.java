public class LinkedList2 {
    class Node{
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
        //creat newNode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(3);
    }
}
