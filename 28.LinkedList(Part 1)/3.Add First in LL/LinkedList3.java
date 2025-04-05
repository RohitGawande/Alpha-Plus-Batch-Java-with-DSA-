public class LinkedList3 {
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
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
}

